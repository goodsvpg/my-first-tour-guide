package domain;

import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Guide extends User{
	
	public Guide(String email, String nickName) {
		this(email, nickName, "Guide");
	}
	
	private Guide(String email, String nickName, String role) {
		this.email = email;
		this.nickName = nickName;
		this.role = role;
	}

	public Place enrollPlace(Scanner sc){
		Place place = null;
		
		if(sc.hasNext()){
			String[] strArr = sc.next().split(",");
			for(int i=0;i<strArr.length;i++){
				System.out.println(strArr[i]);
			}
			if(strArr.length==3){
				place = new Place(strArr[0], strArr[1], strArr[2]);
			}else{
				System.out.println("다시 입력해주세요");
			}
		}
		return place;
	}
	
	public boolean enrollTour(Scanner sc, List<Place> placeList, Board board){
		if(sc.hasNext()){
			String[] strArr = sc.next().split(",");
			if(strArr.length==3){
				Tour myTour = new Tour(this, strArr[0], strArr[1], Integer.parseInt(strArr[2]), placeList);
				board.saveTour(myTour);
				return true;
			}
		}
		return false;
	}
	
	public boolean confirmTourist(Tourist tourist, Tour tour) {
//		boolean IsReservationPosible = tour.isFull();
//		if(!IsReservationPosible){
//			tour.updateCount();
//		}
//		return IsReservationPosible;
		return false;
	}

	@Override
	public String toString() {
		return "Guide [email=" + email + ", nickName=" + nickName + "]";
	}
	
}
