package domain;

import java.util.List;

import resource.TourResource;

public class Tour {
	//private User user;
	
	private Long id;
	
	private String title;
	private String description;
	
	private Guide guide;
	private List<Place> placeList;
	
	public Tour() {
		// TODO Auto-generated constructor stub
	}
	
	public Tour(Guide guide, String title, String description, List<Place> placeList) {
		this.guide = guide;
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

	public void provideTourInfo() {
		// TODO Auto-generated method stub
		//return new TourResource(tour);
	}

	@Override
	public String toString() {
		return "Tour [id=" + id + ", title=" + title + ", description=" + description + ", guide=" + guide
				+ ", placeList=" + placeList + "]";
	}
	
	
}