package learning.mapper;

import java.util.List;

import learning.model.Player;

public interface PlayerDao {
	void save (Player player);
	
	Player findByKey(Integer id);
	
	List<Player> findAll();
}
