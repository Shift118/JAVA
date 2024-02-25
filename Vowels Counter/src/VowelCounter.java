import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
		int count = 0;
		String text;
		System.out.print("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		text = sc.nextLine().toLowerCase();
		sc.close();
		char charOfText[] = text.toCharArray();
		for (int i = 0; i < text.length();i++) {
			switch(charOfText[i]) {
			case 'a','e','i','o','u': count++;
								  break;
			}
		}
		System.out.println("Number of Vowls in "+text+" is: "+count);

	}

}
