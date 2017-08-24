package domain;

import java.util.ArrayList;
import java.util.List;

import resource.TourResource;

public class Board {
	private List<Tour> tourList;
	
	public Board(List<Tour> tourList) {
		this.tourList = tourList;
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
	
	//추후에 변경
//	public TourResource showTour(String tourId){
//		
//		return tour.provideTourInfo();
//	}
}
