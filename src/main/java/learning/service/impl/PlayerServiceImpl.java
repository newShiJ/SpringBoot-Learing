package learning.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import learning.mapper.PlayerDao;
import learning.model.Player;
import learning.service.myinterface.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService{

	@Autowired
	private PlayerDao playerDao;
	
	@Override
	public void add(Player player) {
		playerDao.save(player);
	}

	@Override
	public List<Player> getAll() {
		PageHelper.startPage(1, 2);
		return playerDao.findAll();
	}

}
