package domain;

public class Tour {

	private User user;
	
	private Long id;
	
	private String title;
	private String description;
	
	public Tour() {
		// TODO Auto-generated constructor stub
	}
	
	public Tour(User user, String title, String description) {
		this.user = user;
		this.title = title;
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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
}
