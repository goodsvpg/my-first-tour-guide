package domain;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import resource.TourResource;

public class Board {
	private List<Tour> tourList;
	
	private Board() {
		tourList = new LinkedList<>();
	}
	
	private static class Singleton{
		private static final Board board = new Board(); 
	}
	
	public static Board getInstance(){
		return Singleton.board;
	}
	
	//List<Tour>를  Resources<TourResource>로 변경해야함
	public List<Tour> giveTourList(String address) {
		//address에 해당하는 trip리스트를 요청한다
		List<Tour> matchedTourList = new LinkedList<>();
		
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
	
	private void showTourList(){
		StringBuilder sb = new StringBuilder();
		for(Tour t : tourList){
			sb.append(t.toString());
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

	//추후에 변경
//	public TourResource showTour(String tourId){
//		return tour.provideTourInfo();
//	}
}
