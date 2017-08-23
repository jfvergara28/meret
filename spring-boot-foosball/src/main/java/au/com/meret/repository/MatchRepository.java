package au.com.meret.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import au.com.meret.model.Match;

public interface MatchRepository extends JpaRepository<Match, Long>{

}
