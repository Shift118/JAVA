import java.util.Scanner;

public class QuadraticTest {

	public static void main(String[] args) {
		QuadraticEquations p1 = new QuadraticEquations();
		Scanner cs = new Scanner(System.in);
		System.out.print("Enter a: ");
		p1.setA(cs.nextDouble());
		System.out.print("Enter b: ");
		p1.setB(cs.nextDouble());
		System.out.print("Enter c: ");
		p1.setC(cs.nextDouble());
		
		p1.printRoots();
		cs.close();
	}

}
