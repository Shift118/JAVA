import java.util.Date;

public class Goalie  extends SoccerPlayer{
	protected int Saves_Made , Average_Goals_per_game;
	public Goalie(String First_Name,String Last_Name,int Games,Date Start_Date,int Saves_Made ) {
		super(First_Name,Last_Name,Games,Start_Date);
		this.Saves_Made = Saves_Made;
	}
	void setSaves(int saves) {
		Saves_Made = saves;
	}
	int getSaves() {
		return Saves_Made;
	}
	double CalcAvg() {
			double x = Saves_Made/super.Games; 
			int n = 1; // Round to
			return Math.round(x * Math.pow(10, n)) / Math.pow(10, n);
	}
	@Override
	public String toString() {
		return "Name: "+First_Name+" "+Last_Name+"\nNumber of Games: "+Games+"\nDate: "+Start_Date+"\nSaves Made: "+Saves_Made+"\nAverage Goals per Game: "+ CalcAvg();
	}
}
