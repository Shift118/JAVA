import java.util.Scanner;

public class Roman_Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter the Roman Number: ");
		String romanNum = cs.nextLine();
		Roman x = new Roman(romanNum.toUpperCase());
		System.out.println(romanNum +" == "+x.RomanTOString());
		cs.close();
	}
}