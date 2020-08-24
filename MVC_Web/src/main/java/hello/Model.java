package hello;


import java.util.List;
import java.util.LinkedList;

public class Model {
	
	private List<User> users = new LinkedList<User>();

	
	public void addUser(User user) {
		users.add(user);
	}
	
	//View is observing the Model
	public User login(String email, String password) {
		for(User user:users) {
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) return user;
		}
		return null;
	}

}
