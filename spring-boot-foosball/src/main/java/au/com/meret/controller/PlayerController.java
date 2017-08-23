package au.com.meret.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import au.com.meret.model.Player;
import au.com.meret.service.PlayerService;

@Controller
public class PlayerController {
	
	@Autowired
	PlayerService playerService;
	
	@RequestMapping(value = "players/retrievePlayers.html", method = RequestMethod.GET)
	public ModelAndView retrievePlayers() {
		return new ModelAndView("players/retrievePlayers", "players", playerService.retrievePlayers());
	}
	
	@RequestMapping(value = "players/addNewPlayer.html", method = RequestMethod.GET)
	public ModelAndView addNewPlayer() {
		Player player = new Player();
		return new ModelAndView("players/newPlayer", "form", player);
	}
	
	@RequestMapping(value = "players/addNewPlayer.html", method = RequestMethod.POST)
	public String newPlayer(Player player) {	
		playerService.addNewPlayer(player);
		return ("redirect:retrievePlayers.html");
	}
	
	//TODO:
	@RequestMapping(value = "players/deletePlayer.html", method = RequestMethod.GET)
	public ModelAndView deletePlayer() {
		Player player = new Player();
		return new ModelAndView("players/choosePlayer", "form", player.getId());
	}
	
	//TODO:
	@RequestMapping(value = "players/deletePlayer.html", method = RequestMethod.POST)
	public String choosePlayer(long id) {
		playerService.deletePlayer(id);
		return ("redirect:retrievePlayers.html");
	}
	
	//TODO:
	@RequestMapping("players/comparePlayers.html")
	public ModelAndView comparePlayers() {
		return new ModelAndView("players/comparePlayers");
	}
	
}
