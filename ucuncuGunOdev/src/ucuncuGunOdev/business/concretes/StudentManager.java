package ucuncuGunOdev.business.concretes;

import java.util.ArrayList;
import java.util.List;

import ucuncuGunOdev.business.abstracts.StudentService;
import ucuncuGunOdev.entities.concretes.Student;

public class StudentManager implements StudentService {

	private List<Student> studentList;
	
	public StudentManager() {
		studentList = new ArrayList<Student>();
	}
	@Override
	public void add(Student student) {
		// TODO Auto-generated method stub
		System.out.println("Eklendi => "+ student.getNameSurname());
		studentList.add(student);
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return studentList;
	}

}
