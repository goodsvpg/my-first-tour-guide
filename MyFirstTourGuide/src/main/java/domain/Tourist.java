package domain;

import java.util.List;
import java.util.Scanner;

import resource.TourResource;

public class Tourist extends User{
	public Tourist(String email, String nickName){
		this(email,nickName,"tourist");
	}
	
	private Tourist(String email, String nickName, String role){
		this.email = email;
		this.nickName = nickName;
		this.role = role;
	}
	
	public List<Tour> requestTourList(String address, Board board){
		List<Tour> tourList = board.giveTourList(address);
		return tourList;
	}
	
	//추후에 변경
//	public TourResource chooseTour(String tourId, Board board){
//		//tour.provideTourInfo();
//		TourResource tourInfo = board.showTour(tourId);
//		return tourInfo;
//	}
	
	public boolean requestToParticipateTour(Tour tour, Guide guide, ReservationList reservationList){
		return guide.confirmTourist(this, tour, reservationList);
	}
}
