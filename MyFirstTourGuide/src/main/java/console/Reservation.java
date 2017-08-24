package console;

import java.util.Scanner;

import domain.Board;
import domain.Tourist;

public class Reservation {
	Tourist tourist = null;
	
	public void start(){
		login();
		System.out.println("장소를 입력해 주세요");
		Scanner sc = new Scanner(System.in);
		//tourist.requestTourList(sc.nextLine(), board);		
	}	
	
	public void login(){
		tourist = new Tourist("aa@gmail.com","용과");
		//추후 이메일 입력시 연결 링크를 보내는 것으로 변경
	}

}
