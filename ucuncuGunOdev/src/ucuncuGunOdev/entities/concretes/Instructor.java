package ucuncuGunOdev.entities.concretes;

import ucuncuGunOdev.entities.abstracts.Entity;

public class Instructor implements Entity{
	private int id;
	private String nameSurname;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String nameSurname) {
		super();
		this.id = id;
		this.nameSurname = nameSurname;
	}

	public String getNameSurname() {
		return nameSurname;
	}

	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}

	public int getId() {
		return id;
	}
}
