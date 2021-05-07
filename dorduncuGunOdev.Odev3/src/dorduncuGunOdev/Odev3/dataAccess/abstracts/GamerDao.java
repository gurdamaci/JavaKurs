package dorduncuGunOdev.Odev3.dataAccess.abstracts;

import java.util.List;

import dorduncuGunOdev.Odev3.entities.concretes.Game;
import dorduncuGunOdev.Odev3.entities.concretes.Gamer;

public interface GamerDao {
	boolean add(Gamer game);
	boolean update(Gamer game);
	boolean delete(Gamer game);	
	void addFavoriteGames(Gamer gamer, List<Game> game);
}
