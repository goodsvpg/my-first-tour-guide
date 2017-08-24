package console;

import java.util.List;
import java.util.Scanner;

import domain.Board;
import domain.Guide;
import domain.Tour;
import domain.Tourist;

public class Reservation {
	Tourist tourist = null;
	
	List<Tour> tourList;
	
	public void start(){
		Scanner sc = new Scanner(System.in);
		
		Guide guide = new Guide("follow@me.com", "reliable");
		
		tourList = guide.enrollTour(sc);
		
		Board board = new Board(tourList);
		
		login();
		
		System.out.println("장소를 입력해 주세요");
		
		showTourList(sc.nextLine(), board);
	}	
	
	private void login(){
		tourist = new Tourist("aa@gmail.com","용과");
		//추후 이메일 입력시 연결 링크를 보내는 것으로 변경
	}

	private void showTourList(String address, Board board){
		//해당 장소에서 이루어 지는 tour 리스트를 보여줌
		tourist.requestTourList(address, board);
	}
	
	private void selectTour(){
		//tour정보 보여줌
	}
	
	private void reserveTour(){
		
	}
	
	private void confirmTour(){
		
	}
}
