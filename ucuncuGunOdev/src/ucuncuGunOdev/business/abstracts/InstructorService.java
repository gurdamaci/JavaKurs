package ucuncuGunOdev.business.abstracts;

import java.util.List;

import ucuncuGunOdev.entities.concretes.Instructor;

public interface InstructorService {

	void add(Instructor instructor);
	List<Instructor> getAll();
}
