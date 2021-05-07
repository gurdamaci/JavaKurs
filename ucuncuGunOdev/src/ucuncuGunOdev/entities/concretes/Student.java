package ucuncuGunOdev.entities.concretes;

import ucuncuGunOdev.entities.abstracts.Entity;

public class Student implements Entity {

	private int id;
	private String nameSurname;
	private int age;	
	
	public Student() {
		
	}

	public Student(int id, String nameSurname, int age) {
		super();
		this.id = id;
		this.nameSurname = nameSurname;
		this.age = age;
	}

	public String getNameSurname() {
		return nameSurname;
	}

	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}
	
}
