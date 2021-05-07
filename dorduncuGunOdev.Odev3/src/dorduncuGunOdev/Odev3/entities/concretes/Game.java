package dorduncuGunOdev.Odev3.entities.concretes;

import dorduncuGunOdev.Odev3.core.abstracts.Entity;

public class Game implements Entity{
	private int id;
	private String name;
	private double price;
	
	public Game() {}
	
	public Game(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

}
