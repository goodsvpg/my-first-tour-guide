package domain;

import java.util.ArrayList;
import java.util.List;


public class User {
	private Long id;
	
	protected String email;
	protected String nickName;
	protected String role;

	User() {
	}
	
	public User(String email, String nickName, String role) {
		this.email = email;
		this.nickName = nickName;
		this.role = role;
	}
}
