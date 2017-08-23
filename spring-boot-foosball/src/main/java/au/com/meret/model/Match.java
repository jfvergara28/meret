package au.com.meret.model;

//import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Match {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;
//	private LocalDate currentDate; //issue with date; AttributeConverter does not work
	private String teamOne;
	private String teamTwo;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
//	public LocalDate getCurrentDate() {
//		return currentDate;
//	}
	
//	public void setCurrentDate(LocalDate currentDate) {
//		this.currentDate = currentDate;
//	}
	
	public String getTeamOne() {
		return teamOne;
	}
	
	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}
	
	public String getTeamTwo() {
		return teamTwo;
	}
	
	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}

	@Override
	public String toString() {
		return "Match[id : " + id + "\t" + teamOne + "\t vs \t" + teamTwo + "]";
	}	

}
