package dorduncuGunOdev.Odev3.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dorduncuGunOdev.Odev3.dataAccess.abstracts.GameDao;
import dorduncuGunOdev.Odev3.entities.concretes.Game;

public class HibernateGameDao implements GameDao{

	private List<Game> gameList;
	public HibernateGameDao() {
		this.gameList = new ArrayList<Game>();
	}
	
	//test edildi.
	@Override
	public boolean add(Game game) {
		// TODO Auto-generated method stub
		this.gameList.add(game);		
		return true;
	}

	//test edildi.
	@Override
	public boolean update(Game game) {
		// TODO Auto-generated method stub
		
		try {
			//https://www.baeldung.com/find-list-element-java 
			Game updatedGame = gameList.stream()
					.filter(g -> game.getId() == g.getId())
					.findAny()
					.orElse(null);
			
			int updatedItemIndex = gameList.indexOf(updatedGame);
			
			updatedGame.setName(game.getName());						
			gameList.add(updatedItemIndex,updatedGame);			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return true;
	}

	@Override
	public boolean delete(Game game) {
		// TODO Auto-generated method stub
		int deletedItemIndex = gameList.indexOf(game);
		gameList.remove(deletedItemIndex);
		return true;
	}

	//test edildi.
	@Override
	public List<Game> getAll() {
		// TODO Auto-generated method stub
		
		return this.gameList;
	}

}
