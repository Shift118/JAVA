import java.util.Date;

public class SoccerPlayer {
	String First_Name, Last_Name;
	int Games;
	Date Start_Date;
	public SoccerPlayer(String First_Name,String Last_Name,int Games,Date Start_Date) {
		this.First_Name = First_Name;
		this.Last_Name = Last_Name;
		this.Games = Games;
		this.Start_Date = Start_Date;
	}
	void setFirstName (String x) {
		this.First_Name = x;
	}
	void setLastName (String x) {
		this.Last_Name = x;
	}
	void setGames (int x) {
		this.Games = x;
	}
	String getFirstName () {
		return this.First_Name;
	}
	String getLastName () {
		return this.Last_Name;
	}
	int getGames () {
		return this.Games;
	}
	public String toString() {
		return "H";
	}
}
