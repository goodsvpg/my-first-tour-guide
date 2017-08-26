package console;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domain.Board;
import domain.Guide;
import domain.Place;
import domain.Tour;
import domain.Tourist;

public class Reservation {
	private static final int MAX_PLACE_NUM = 5;
	private static final String STOP_INPUT = "0";
			
	private Tourist tourist;
	private Guide guide;
	private Board board;
	
	private List<Tour> tourList;
	private List<Place> placeList;
	
	private List<Tour> tourListSearchByAddress;
	
	public void start(){
		Scanner sc = new Scanner(System.in);
		
		guide = new Guide("follow@me.com", "reliable");
		
		login();

		board = Board.getInstance();
		
		menu: while(true){
			System.out.println("여행 등록은 1번 여행 선택은 2번을 눌러주세요(그만하려면 0을 눌러주세요)");
			
			switch (sc.next()) {
				case "1":
					enrollTour(sc);
					break;
				case "2":
					System.out.println("주소를 입력해 주세요");
					showTourList(sc.nextLine(), board);
					break;
				case STOP_INPUT:
					System.out.println("이용해주셔서 감사합니다.");
					break menu;
				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
			}
		}
		System.out.println("bye!");
	}	
	
	private void enrollTour(Scanner sc){
		placeList = new ArrayList<Place>();
		int placeCount = 0;
		
		enrollPlace: while(placeCount!=MAX_PLACE_NUM){
			System.out.println("장소 정보를 먼저 입력해 주세요(제목,설명,주소).");
			Place tempPlace = guide.enrollPlace(sc);
			
			if(tempPlace!=null){
				placeList.add(tempPlace);
			}else{
				System.out.println("다시 입력해주세요");
				continue enrollPlace;
			}
				
			
			askEnrollMorePlace: while(placeList.size()!=0){
				System.out.println("더 많은 장소를 입력하시려면 y,여행정보를 입력하시려면 n을 입력해주세요.");
				if(sc.hasNext()){
					switch (sc.next()) {
						case "y":
							placeCount++;
							break askEnrollMorePlace;
						case "n":
							break enrollPlace;
						default:
							continue;
					}
				}
			}
		}
		
  		enrollTour: while(placeList.size()!=0){
			System.out.println("여행 정보를 입력해 주세요(제목,설명)");
			
			if(guide.enrollTour(sc, placeList, board)){
				System.out.println("여행이 등록되었습니다.");
				break enrollTour;
			}else{
				System.out.println("다시 입력해주세요");
				continue enrollTour;
			}
		}
	}
	
	private void login(){
		tourist = new Tourist("aa@gmail.com","용과");
		//추후 이메일 입력시 연결 링크를 보내는 것으로 변경
	}

	private void showTourList(String address, Board board){
		//해당 장소에서 이루어 지는 tour 리스트를 보여줌
		tourListSearchByAddress = tourist.requestTourList(address, board);
	}
	
	private void selectTour(){
		//tour정보 보여줌
	}
	
	private void reserveTour(){
		
	}
	
	private void confirmTour(){
		
	}
}
