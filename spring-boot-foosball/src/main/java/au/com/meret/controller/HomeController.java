package au.com.meret.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home.html")
	public ModelAndView homePage() {
		return new ModelAndView("home");
	}
	
	@RequestMapping("players/players.html")
	public ModelAndView getPlayersPage() {
		return new ModelAndView("players/players");
	}
	
	@RequestMapping("matches/matches.html")
	public ModelAndView getMatchesPage() {
		return new ModelAndView("matches/matches");
	}

}
