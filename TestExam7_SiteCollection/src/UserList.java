import java.util.ArrayList;

public class UserList {
	private ArrayList<User> users;
	public UserList(){
		this.users = new ArrayList<User>();
	}

	public int getNumberOfUsers(){
		return users.size();
	}

	public void AddUser(User user){
		users.add(user);
	}

	public User getUser(int index){
		return users.get(index);
	}

	public User findAUserWithAccessTo(Website site){
		for (int i = 0; i < getNumberOfUsers(); i++){
			if (users.get(i).getAccessibleSites().contains(site)){
				return users.get(i);
			}
		}
		return null;
	}

	public User findFirstAdministrator(){
		for (int i = 0; i < getNumberOfUsers(); i++){
			if (users.get(i) instanceof Administrator){
				return (Administrator) users.get(i);
			}
		}
		return null;
	}


}
