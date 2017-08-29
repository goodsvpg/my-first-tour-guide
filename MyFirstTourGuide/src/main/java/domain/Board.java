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
		//tour의 id는 자동으로 증가하게 변경할 것이므로 삭제 예정
		tour.setId(tourList.size()+1);
		tourList.add(tour);
	}
	
}
