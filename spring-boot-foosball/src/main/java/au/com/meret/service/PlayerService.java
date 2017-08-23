package au.com.meret.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import au.com.meret.model.Player;
import au.com.meret.repository.PlayerRepository;

@Service
public class PlayerService {
	
	@Autowired
	PlayerRepository playerRepository;
	
	public List<Player> retrievePlayers() {
		List<Player> allPlayers = playerRepository.findAll();
		return allPlayers;
	}
	
	public void addNewPlayer(Player player) {
		playerRepository.save(player);
	}
	
	public void deletePlayer(long id) {
		playerRepository.delete(id);
	}
	
	//TODO:
//	public List<Player> comparePlayers() {}

}
