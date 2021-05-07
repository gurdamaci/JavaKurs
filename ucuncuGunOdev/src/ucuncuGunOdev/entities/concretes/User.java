package ucuncuGunOdev.entities.concretes;

import ucuncuGunOdev.entities.abstracts.Entity;

public class User implements Entity {
	private int id;
	private String nameSurname;	 
	

	public User() {
		
	}

	public User(int id, String nameSurname) {
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
