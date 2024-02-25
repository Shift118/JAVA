import java.util.Scanner;

public class SquaresMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square[] square = new Square[2];
//    	square[0] = new Square(5,"blue");
//		square[1] = new Square();

		Scanner cs = new Scanner(System.in);
		
		for (int i = 0; i < 2 ; i++) {
			int side;
			String color;
			System.out.println("Square "+ (i+1) + " Data:-");
			System.out.print("Enter The length of a side: ");
			side =cs.nextInt();
			cs.nextLine();
			System.out.print("Enter The color: ");
			color = cs.nextLine();
			System.out.println("##############");
//			square[i].setSide(side);   //You Must First Declare that square[i] = new Square !!
//			square[i].setColor(color); //You Must First Declare that square[i] = new Square !!
			square[i] = new Square(side,color); // or declare it with all the values at once.
		}
		for (int i = 0; i < 2 ; i++) {
			square[i].squarePrint(i);
		}
		cs.close();
	}

}
