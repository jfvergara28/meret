package au.com.meret.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import au.com.meret.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
