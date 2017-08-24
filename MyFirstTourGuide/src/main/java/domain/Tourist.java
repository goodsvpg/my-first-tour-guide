package domain;

import java.util.List;

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
		List<Tour> tourList = board.showTripList(address);
		return tourList;
	}
	
	public void chooseTour(Tour tour){
		tour.getTourInfo();
	}
	
	public void requestToParticipateTour(Tour tour, Guide guide){
		guide.confirmTourist(this, tour);
	}
	
}
