package domain;

import java.util.List;

public class Tour {
	//private User user;
	
	private Long id;
	private String title;
	private String description;
	private List<Place> placeList;
	
	public Tour() {
		// TODO Auto-generated constructor stub
	}
	
	public Tour(String title, String description, List<Place> placeList) {
		this.title = title;
		this.description = description;
		this.placeList = placeList;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	public List<Place> getPlaceList() {
		return placeList;
	}

	public void setPlaceList(List<Place> placeList) {
		this.placeList = placeList;
	}

	public void getTourInfo() {
		// TODO Auto-generated method stub
		
	}
}
