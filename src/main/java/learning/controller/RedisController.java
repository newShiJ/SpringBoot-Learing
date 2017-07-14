package learning.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import learning.model.Player;
import learning.utils.redis.RedisClient;

@Controller
@RequestMapping("/redis")
public class RedisController {
	
	@Autowired
	private RedisClient redisClient;
	
	@RequestMapping("/get")
	@ResponseBody
	public Object get()throws Exception{
		String string = redisClient.get("5");
		Player player = null;
		//player = new ObjectMapper().readValue(string,Player.class);
		player = redisClient.getObject("5",Player.class);
		return player;
	}
	
	@ResponseBody
	@RequestMapping
	public void set(){
		Player player = new Player();
		player.setName("莱昂纳德");
		player.setId(5);
		player.setPoints(27.1);
		redisClient.set(player.getId().toString(),player);
	}
	
	
}





