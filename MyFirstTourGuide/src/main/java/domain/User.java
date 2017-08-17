package domain;

import java.util.ArrayList;
import java.util.List;


public class User {
	private Long id;
	private String email;
	private String nickName;
	private String role;

	private List<Tour> tripList = new ArrayList<Tour>(); 
	
	User() {
	}
	
	public User(String email, String nickName, String role) {
		this.email = email;
		this.nickName = nickName;
		this.role = role;
	}
}
