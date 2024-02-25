import java.util.Date;

public class Defense  extends SoccerPlayer{
	protected int totalTackles;
	boolean redCard;
	public Defense(String First_Name,String Last_Name,int Games,Date Start_Date,int totalTackles,boolean cardRed) {
		super(First_Name,Last_Name,Games,Start_Date);
		this.totalTackles = totalTackles;
		this.redCard = cardRed;
	}
	void setTackles(int T) {
		this.totalTackles = T;
	}
	int getTackles() {
		return totalTackles;
	}
	void setCardRed(boolean b) {
		redCard = b;
	}
	boolean getCard() {
		return redCard;
	}
	@Override
	public String toString() {
		return "Name: "+First_Name+" "+Last_Name+"\nNumber of Games: "+Games+"\nDate: "+Start_Date+"\nTotal Number of Tackles : "+totalTackles+"\nRedCard: "+ redCard;
	}
}
