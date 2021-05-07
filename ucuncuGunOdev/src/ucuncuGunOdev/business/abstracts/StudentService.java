package ucuncuGunOdev.business.abstracts;

import java.util.List;

import ucuncuGunOdev.entities.concretes.Student;

public interface StudentService {

	void add(Student student);
	List<Student> getAll();
}
