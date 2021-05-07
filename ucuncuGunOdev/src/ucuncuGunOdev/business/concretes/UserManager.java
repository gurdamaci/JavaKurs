package ucuncuGunOdev.business.concretes;

import java.util.ArrayList;
import java.util.List;

import ucuncuGunOdev.business.abstracts.UserService;
import ucuncuGunOdev.entities.concretes.User;

public class UserManager implements UserService{

	private List<User> userList;
	
	public UserManager() {
		userList = new ArrayList<User>();
	}
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		System.out.println("Eklendi => "+ user.getNameSurname());
		userList.add(user);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userList;
	}


}
