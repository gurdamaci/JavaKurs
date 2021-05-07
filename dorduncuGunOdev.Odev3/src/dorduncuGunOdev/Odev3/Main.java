package dorduncuGunOdev.Odev3;

import java.util.ArrayList;
import java.util.List;

import dorduncuGunOdev.Odev3.dataAccess.concretes.HibernateGameDao;
import dorduncuGunOdev.Odev3.entities.concretes.Game;
import dorduncuGunOdev.Odev3.entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Game game1 = new Game(1,"PES 2016", 25);
		Game game2 = new Game(1,"FİFA 2021", 50);
		
		HibernateGameDao test = new HibernateGameDao();
		
		System.out.println("Ekleme Örnek");
		test.add(game2);
		test.add(game1);
		
		for (Game game : test.getAll()) {
			System.out.println("Game List => "+ game.getName()+ " " + game.getPrice());
		}
		
		System.out.println("Update örnek");
		Game updateGame = new Game(1,"FİFA 2028", 55);
		test.update(updateGame);
		for (Game game : test.getAll()) {
			System.out.println("Game List => "+ game.getName()+ " " + game.getPrice());
		}
		
		System.out.println("Delete örnek");
		Game deletedGame = new Game(1,"FİFA 2028", 55);
		test.delete(deletedGame);
		for (Game game : test.getAll()) {
			System.out.println("Game List => "+ game.getName()+ " " + game.getPrice());
		}
	}

}
