package learning.service.myinterface;

import java.util.List;

import learning.model.Player;

public interface PlayerService {
	void add(Player player);
	
	List<Player> getAll();
}
