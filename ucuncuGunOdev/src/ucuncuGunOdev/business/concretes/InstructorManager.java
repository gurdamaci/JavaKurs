package ucuncuGunOdev.business.concretes;

import java.util.ArrayList;
import java.util.List;

import ucuncuGunOdev.business.abstracts.InstructorService;
import ucuncuGunOdev.entities.concretes.Instructor;

public class InstructorManager implements InstructorService{

	private List<Instructor> instructorList;
	public InstructorManager() {
		instructorList = new ArrayList<Instructor>();
	}
	@Override
	public void add(Instructor instructor) {
		// TODO Auto-generated method stub
		System.out.println("Eklendi => "+ instructor.getNameSurname());
		instructorList.add(instructor);
	}
	@Override
	public List<Instructor> getAll() {
		// TODO Auto-generated method stub
		return instructorList;
	}

}
