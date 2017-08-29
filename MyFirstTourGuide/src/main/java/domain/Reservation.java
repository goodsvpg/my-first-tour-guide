package domain;

import java.util.ArrayList;
import java.util.List;

public class Reservation {
	private Tour tour;
	private List<Tourist> touristList;
	private Guide guide;
	
	private int count;
	private boolean isFull;
	
	public Reservation(Tour tour, Tourist tourist, Guide guide) {
		// TODO Auto-generated constructor stub
		this.tour = tour;
		touristList = new ArrayList<>();
		touristList.add(tourist);
		this.guide = guide;
	}

	public boolean addTourList(Tourist tourist){
		if(!isFull()){
			touristList.add(tourist);
			count++;
			return true;
		}
		return false;
	}
	
	public Tour getTour() {
		return tour;
	}

	private boolean isFull(){
		if(tour.getMaxNumberOfTourist() == count){
			isFull = true;
		}
		return isFull;
	}

	@Override
	public String toString() {
		return "예약 정보 [여행=" + tour + ", 여행자들=" + touristList + ", 가이드=" + guide + ", 예약가능=" + isFull
				+ "]";
	}
}
