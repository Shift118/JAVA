import java.util.Scanner;

public class MyCar {
	public static void main(String[] args) {
		car c1 = new car();
		String carBrand;
		int year;
		System.out.print("Enter Car Brand: ");
		Scanner cs = new Scanner(System.in);
		carBrand = cs.nextLine();
		System.out.print("Enter Year Model: ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		if ((carBrand.toLowerCase().equals("mitsubishi") || carBrand.toLowerCase().equals( "pegout")) && (year > 500)){
			c1.setBrand(carBrand);
			c1.setYearModel(year);
			System.out.println("Accepted");
		}else {System.out.println("Not Accepted");}
		cs.close();
	}
}
