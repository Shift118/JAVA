import java.util.Date;
public class SoccerTest {

	public static void main(String[] args) {
		Date date = new Date();
		Forward f1 = new Forward("M","y",99,date,100);
		Defense d1 = new Defense("M","y",99,date,100,true);
		Goalie g1 = new Goalie("M","y",99,date,100);
		System.out.println(f1);
		System.out.println("########");
		System.out.println(d1);
		System.out.println("########");
		System.out.println(g1);
		System.out.println("########");

	}
}