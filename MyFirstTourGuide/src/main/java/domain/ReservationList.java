package domain;

import java.util.ArrayList;
import java.util.List;

public class ReservationList {
	
	private int id;
	
	private Tour tour;
	private List<Tourist> touristList;
	
	private int count;
	private boolean isFull;
	
	private ReservationList(){
		touristList = new ArrayList<>();
	}
	
	public ReservationList(Tour tour, Tourist tourist) {
		this();
		this.tour = tour;
		this.touristList.add(tourist);
	}
	
	public boolean saveToReservationList(Tour tour, Tourist tourist){
		
		return true;
	}
	
	private void updateCount(Tour tour) {
		count++;
		if(tour.getMaxNumberOfTourist() == count){
			isFull = true;
		}
	}
}
