import java.util.Date;
import java.lang.Math;

public class Forward extends SoccerPlayer{
	protected int Goals_Scored , Average_Goals_per_game;
	public Forward(String First_Name,String Last_Name,int Games,Date Start_Date,int Goals_Scored) {
		super(First_Name,Last_Name,Games,Start_Date);
		this.Goals_Scored = Goals_Scored;
	}
	
	void setGoals(int goals) {
		Goals_Scored = goals;
	}
	int getGoals() {
		return Goals_Scored;
	}
	double CalcAvg() {
		if (super.Games == 0) {Average_Goals_per_game = 0; return Average_Goals_per_game;}
		else{
			double x = Goals_Scored/super.Games; 
			return Math.round(x * Math.pow(10, 1)) / Math.pow(10, 1);
		}
	}
	@Override
	public String toString() {
		return "Name: "+First_Name+" "+Last_Name+"\nNumber of Games: "+Games+"\nDate: "+Start_Date+"\nGoals Scored: "+Goals_Scored+"\nAverage Goals per Game: "+ CalcAvg();
	}
}
