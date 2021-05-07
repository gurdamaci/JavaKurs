package ucuncuGunOdev;

import java.util.ArrayList;
import java.util.List;

import ucuncuGunOdev.business.abstracts.InstructorService;
import ucuncuGunOdev.business.abstracts.StudentService;
import ucuncuGunOdev.business.abstracts.UserService;
import ucuncuGunOdev.business.concretes.InstructorManager;
import ucuncuGunOdev.business.concretes.StudentManager;
import ucuncuGunOdev.business.concretes.UserManager;
import ucuncuGunOdev.entities.concretes.Student;
import ucuncuGunOdev.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService userService = new UserManager();
		StudentService studentService = new StudentManager();
		InstructorService ınstructorService = new InstructorManager();
		
		//user işlemleri
		User user1 = new User(1,"Adil KUDU");
		User user2 = new User(2,"Alim KUDU");
		
		List<User> userList = new ArrayList<User>();
		userList.add(user1);
		userList.add(user2);
		
		//user ekleme
		for (User user : userList) {
			userService.add(user);
		}
		
		System.out.println();
		//user listeleme
		List<User> userList2 = userService.getAll();
		for (User user : userList2) {
			System.out.println("Eklenen Userlar => " + user.getNameSurname());
		}
		
		System.out.println();
		//Student işlemleri
		Student student1 = new Student(1,"Adil KUDU",28);
		Student student2 = new Student(2,"Alim KUDU",28);
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(student1);
		studentList.add(student1);
		
		//user ekleme
		for (Student student : studentList) {
			studentService.add(student);
		}
		
		System.out.println();
		//user listeleme
		List<Student> studentList2 = studentService.getAll();
		for (Student student : studentList2) {
			System.out.println("Eklenen Studentlar => " + student.getNameSurname());
		}

	}

}
