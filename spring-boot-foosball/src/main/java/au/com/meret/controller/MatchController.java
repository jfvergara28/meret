package au.com.meret.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import au.com.meret.model.Match;
import au.com.meret.service.MatchService;

@Controller
public class MatchController {
	
	@Autowired
	MatchService matchService;
	
	@RequestMapping(value = "matches/viewMatches.html", method = RequestMethod.GET)
	public ModelAndView viewMatches() {
		return new ModelAndView("matches/viewMatches", "matches", matchService.viewMatches());
	}
	
	@RequestMapping(value = "matches/createMatch.html", method = RequestMethod.GET)
	public ModelAndView createMatch() {
		Match match = new Match();
		return new ModelAndView("matches/newMatch", "form", match);
	}
	
	@RequestMapping(value = "matches/createMatch.html", method = RequestMethod.POST)
	public String newMatch(Match match) {
		matchService.createMatch(match);
		return ("redirect:viewMatches.html");
	}	

}
