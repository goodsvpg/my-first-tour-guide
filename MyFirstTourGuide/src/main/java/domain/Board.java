package domain;

import java.util.ArrayList;
import java.util.List;

public class Board {
	private List<Tour> tourList;
	
	public Board(List<Tour> tourList) {
		this.tourList = tourList;
	}

	public List<Tour> showTripList(String address) {
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

}
