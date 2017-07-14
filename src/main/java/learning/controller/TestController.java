package learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import learning.model.Player;
import learning.service.myinterface.PlayerService;

@Controller
@RequestMapping("/Test")
public class TestController {
	@Autowired
	private PlayerService playerService;
	
	@RequestMapping("/getAll")
	@ResponseBody
	public Object getAll(){
		Player player = new Player();
		player.setName("杜兰特");
		player.setPoints(28.4);
		player.setId(3);
		return player;				
	}
	
	@RequestMapping("/all")
	@ResponseBody
	public Object get(){
		return playerService.getAll();
	}
	
	@RequestMapping("/add")
	public String add(Player player){
		playerService.add(player);
		return "test/hello";
	}
	
	@RequestMapping("/hello")
	public String hello(Model model) {
		List<Player> list = playerService.getAll();
		model.addAttribute("list",list);
		return "test/hello";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
