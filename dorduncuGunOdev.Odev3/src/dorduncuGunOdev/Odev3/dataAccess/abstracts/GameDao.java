package dorduncuGunOdev.Odev3.dataAccess.abstracts;

import java.util.List;

import dorduncuGunOdev.Odev3.entities.concretes.Game;

public interface GameDao {
	boolean add(Game game);
	boolean update(Game game);
	boolean delete(Game game);	
	List<Game> getAll();
}
