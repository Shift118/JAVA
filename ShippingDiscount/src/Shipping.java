import java.util.Scanner;

public class Shipping {
	static double discount(double price) {
		if (price  > 100) {
			price += 10;
			return ((price) - (price) * (0.25)); 
		}else {
			price += 5;
			return ((price) - (price) * (0.15)); 
		}
	}
	public static void main(String[] args) {
		System.out.print("Enter The Price: ");
		double price;
		Scanner cs = new Scanner(System.in);
		price = cs.nextDouble();
		System.out.println("Total Price = "+discount(price));
		cs.close();
	}
}
