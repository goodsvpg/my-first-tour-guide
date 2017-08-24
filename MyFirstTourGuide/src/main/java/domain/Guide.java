package domain;

public class Guide extends User{
	public Guide(String email, String nickName, String role) {
		super(email, nickName, role);
	}
	public void enrollTour(){}
	public void changeTour(){}
	public void viewTour(){}
	public void deleteTour(){}
	
	//public void chooseWhoCanBook(){}
	
	public void confirmTourist(Tourist tourist, Tour tour) {
	}
	
	public void chooseWhoCanBook(){}
}
