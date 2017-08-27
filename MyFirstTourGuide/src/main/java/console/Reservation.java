package console;

import java.util.ArrayList;
import java.util.LinkedList;
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
		
		tempSetUp();
		//임시
		menu: while(true){
			System.out.println("여행 등록은 '등록'을 여행 선택은 '선택'을 입력해주세요(그만하려면 0을 눌러주세요)");
			switch (sc.next()) {
				case "등록":
					enrollTour(sc);
					break;
				case "선택":
					System.out.println("주소를 입력해 주세요");
					if(showTourList(sc, board)){
						//여행 선택
						break;
					}else{
						System.out.println("해당 주소에 예약 가능한 여행이 없습니다.\n");
						break;
					}
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
	
	private void tempSetUp(){
		List<Place> placeList1 = new ArrayList<>();
		placeList1.add(new Place("Graph table", "생면으로 만든 파스타가 유명", "타페게이트"));
		placeList1.add(new Place("이너프포라이프", "직접 만든 도자기 드립퍼를 파는 곳", "반캉왓"));
		
		List<Place> placeList2= new ArrayList<>();
		placeList2.add(new Place("마라훠궈", "무제한 샤브샤브", "시먼"));
		placeList2.add(new Place("치즈감자", "치즈를 듬뿍 넣고 여러 야채를 올린 감자", "스린야시장"));
		
		board.saveTour(new Tour(guide, "진짜 치앙마이를 만날 시간", "치앙마이의 식당과 관광지를 안내해드립니다.", placeList1));
		board.saveTour(new Tour(guide, "대만 맛집 투어", "가장 유명한 맛집을 소개해드립니다.", placeList2));
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
							break;
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

	private boolean showTourList(Scanner sc, Board board){
		//해당 장소에서 이루어 지는 tour 리스트를 보여줌
		tourListSearchByAddress = tourist.requestTourList(sc, board);
		
		if(tourListSearchByAddress.size()!=0){
			StringBuilder sb = new StringBuilder();
			sb.append("해당 주소의 예약 가능한 여행 목록입니다.\n");
			for(Tour t : tourListSearchByAddress){
				sb.append(t.toString());
				sb.append("\n");
			}
			System.out.println(sb.toString());
			return true;
		}else{
			return false;
		}
	}
	
	private void selectTour(){
		//tour정보 보여줌
	}
	
	private void reserveTour(){
		
	}
	
	private void confirmTour(){
		
	}
}
