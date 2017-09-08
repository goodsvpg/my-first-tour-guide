package console.domain;

import java.util.List;

import resource.TourResource;

public class Tour {
	
	//추후에 자동으로 증가하도록 변경
	private int id;
	
	private String title;
	private String description;
	private int maxNumberOfTourist; 
	
	private Guide guide;
	private List<Place> placeList;
	
	public Tour() {
		// TODO Auto-generated constructor stub
	}
	
	public Tour(Guide guide, String title, String description, int maxNumberOfTourist, List<Place> placeList) {
		this.guide = guide;
		this.title = title;
		this.description = description;
		this.maxNumberOfTourist = maxNumberOfTourist;
		this.placeList = placeList;
	}
	
	public void setId(int id) {
		this.id = id;
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

	public int getMaxNumberOfTourist() {
		return maxNumberOfTourist;
	}

	public String provideTourInfo() {
		return"[번호=" + id +"[제목=" + title + ", 설명=" + description+"]";
	}

	@Override
	public String toString() {
		return "[제목=" + title + ", 설명=" + description + ", 가이드=" + guide
				+ ", 장소 리스트=" + placeList + "]";
	}
	
}