import java.util.Random;
import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		int userIN , random;
		System.out.print("Rock,Paper,Scissors (0,1,2): ");
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		userIN = sc.nextInt();
		random = rand.nextInt(3);
		
		while(userIN <0 || userIN > 2) {
			System.out.println("Please Enter 1,2,3 Only !");
			System.out.println("Rock,Paper,Scissors (0,1,2): ");
			Scanner cs = new Scanner(System.in);
			userIN = cs.nextInt();
		}
		
		if(userIN == random) {
			System.out.println("Draw"); 
		}
		switch(userIN) {
		case 0: if(random == 1) {
						System.out.println("Paper Wins Rock");
						System.out.println("You Lose :(");
					}else {
						System.out.println("Rock Wins Scissors");
						System.out.println("You Win :)");
					}
					break;
		case 1: if(random == 2) {
					System.out.println("Scissors Wins Paper");
					System.out.println("You Lose :(");
				}else {
					System.out.println("Paper Wins Rock");
					System.out.println("You Win :)");
				}
				  break;
		case 2: if(random == 1) {
					System.out.println("Rock Wins Scissors");
					System.out.println("You Lose :(");
				}else {
					System.out.println("Scissors Wins Rock");
					System.out.println("You Win :)");
				}
				  break;
		}
		sc.close();
	}
}

// o "rock"
// 1 "paper"
// 2 "scissors"
