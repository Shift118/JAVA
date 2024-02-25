
public class ClockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock c1 = new Clock(10,00,30);
		//c1.incrementMinutes();
		c1.decrementMinutes();
		c1.decrementHours();
		c1.decrementSeconds();
		c1.printTime();
	}

}
