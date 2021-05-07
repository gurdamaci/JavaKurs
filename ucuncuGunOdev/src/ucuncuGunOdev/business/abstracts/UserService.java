package ucuncuGunOdev.business.abstracts;

import java.util.List;

import ucuncuGunOdev.entities.concretes.User;

public interface UserService {
	void add(User user);
	List<User> getAll();
}
