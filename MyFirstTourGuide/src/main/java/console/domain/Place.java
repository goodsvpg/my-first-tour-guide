package console.domain;

public class Place {
	private String title;
	private String description;
	private String address;
	
	public Place() {
		// TODO Auto-generated constructor stub
	}

	public Place(String title, String description, String address) {
		this.title = title;
		this.description = description;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "장소 [제목=" + title + ", 설명=" + description + ", 주소=" + address + "]";
	}
	
}
