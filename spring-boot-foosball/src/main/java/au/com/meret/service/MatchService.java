package au.com.meret.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import au.com.meret.model.Match;
import au.com.meret.repository.MatchRepository;

@Service
public class MatchService {
	
	@Autowired
	MatchRepository matchRepository;
	
	public List<Match> viewMatches() {
		List<Match> matches = matchRepository.findAll();		
		return matches;
	}
	
	public void createMatch(Match match) {
		matchRepository.save(match);
	}

}
