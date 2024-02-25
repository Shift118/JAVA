import java.util.Scanner;

public class Lifetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int brightness;
		System.out.print("Enter Light bulb Brighness [Watts]? ");
		Scanner cs = new Scanner(System.in);
		brightness = cs.nextInt();
		switch(brightness) {
		case 25: System.out.println("Lifetime = 2500 Hours");
		                break;
		case 40,60: System.out.println("Lifetime = 1000 Hours");
        				break;
		case 75,100: System.out.println("Lifetime = 750 Hours");
        				break;
        default: System.out.println("Lifetime = 0 Hours");
						break;
		}
		cs.close();
	}

}
