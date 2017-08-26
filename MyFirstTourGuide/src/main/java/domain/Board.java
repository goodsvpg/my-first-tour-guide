package domain;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import resource.TourResource;

public class Board {
	private List<Tour> tourList;
	
	private Board() {
		tourList = new LinkedList<Tour>();
	}
	
	private static class Singleton{
		private static final Board board = new Board(); 
	}
	
	public static Board getInstance(){
		return Singleton.board;
	}
	
	//List<Tour>를  Resources<TourResource>로 변경해야함
	public List<Tour> showTourList(String address) {
		//address에 해당하는 trip리스트를 요청한다
		List<Tour> matchedTourList = null;
		
		for(Tour tour : tourList){
			for(Place place : tour.getPlaceList()){
				if(place.getAddress().equals(address)){
					matchedTourList.add(tour);
				}
			}
		}
		
		return matchedTourList;
	}
	
	public void saveTour(Tour tour){
		tourList.add(tour);
	}
	

	//추후에 변경
//	public TourResource showTour(String tourId){
//		
//		return tour.provideTourInfo();
//	}
}
