package domain;

import java.util.List;
import java.util.Scanner;

public class Guide extends User{
	
	public Guide(String email, String nickName) {
		this(email, nickName, "Guide");
	}
	
	private Guide(String email, String nickName, String role) {
		this.email = email;
		this.nickName = nickName;
		this.role = role;
	}
	
	public List<Tour> enrollTour(Scanner sc){
		List<Tour> myTourList = null;
		
		if(sc.hasNext()){
		}
		
		return myTourList;
	}
	public void changeTour(){}
	public void viewTour(){}
	public void deleteTour(){}
	
	//public void chooseWhoCanBook(){}
	
	public void confirmTourist(Tourist tourist, Tour tour) {
	}
	
	public void chooseWhoCanBook(){}
}
