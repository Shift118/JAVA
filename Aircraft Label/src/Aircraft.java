import java.util.Scanner;

public class Aircraft {
	static void aircraft(int speed,int length) {
		if (speed > 1100) {
			if (length < 52) {
				System.out.println("This is Military Aircraft");
			}else { System.out.println("This is Civilian Aircraft"); }
		}else {System.out.println("Aircraft Unknown");}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int speed, length;
		
		System.out.print("Enter Aircraft Speed: ");
		Scanner cs = new Scanner(System.in);
		speed = cs.nextInt();
		
		System.out.printf("Enter Aircraft Length: ");
		Scanner sc = new Scanner(System.in);
		length = sc.nextInt();
		
		aircraft(speed, length);
		cs.close();
		sc.close();
	}

}
