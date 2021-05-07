package dorduncuGunOdev.Odev3.entities.concretes;

import java.util.ArrayList;
import java.util.List;

import dorduncuGunOdev.Odev3.core.abstracts.Entity;

public class Gamer implements Entity{
	private int id;
	private String nameSurname;
	private int age;
	private List<Game> favoriteGames;
	
	public Gamer() {
		this.favoriteGames = new ArrayList<Game>();	
	}

	public Gamer(int id, String nameSurname, int age) {
		super();
		this.id = id;
		this.nameSurname = nameSurname;
		this.age = age;				 		
		this.favoriteGames = new ArrayList<Game>();	
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

	public List<Game> getFavoriteGames() {
		return favoriteGames;
	}

	public void setFavoriteGames(Game favoriteGame) {
		this.favoriteGames.add(favoriteGame);
	}

	//method overloading
	public void setFavoriteGames(List<Game> favoriteGames) {
		this.favoriteGames = favoriteGames;		
	}
	public int getId() {
		return id;
	}
	
}
