import java.util.Scanner;

public class ElectricityBill {
	static void commercial(double bill,double watts) {
		if (watts <= 2000) {
			bill = 1000;
			System.out.println("The bill is equal to "+bill+"$");
		}else {
			bill  = 1000 + 0.005 * (watts - 2000);
			System.out.println("The bill is equal to "+bill+"$");
		}
	}
	static void industrial(double bill,double watts) {
		if (watts < 4000) {
			bill = 1000;
			System.out.println("The bill is equal to "+bill+"$");
		}else if (watts <= 10000 || watts >= 4000) {
			bill = 2000;
			System.out.println("The bill is equal to "+bill+"$");
		}else if(watts > 10000) {
			bill = 3000;
			System.out.println("The bill is equal to "+bill+"$");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String customer;
		double bill = 0, watts;
		System.out.print("Customer [R,C,I] ? ");
		Scanner cs = new Scanner(System.in);
		customer = cs.nextLine();
		
		System.out.print("How Many KilloWatts used ? ");
		Scanner sc = new Scanner(System.in);
		watts = sc.nextDouble();
		
		switch (customer) {
		case "R","r": 	bill = (10 + 0.05) * watts  ;
								System.out.println("The bill is equal to "+bill+"$");
								break;
		case "C","c":	commercial(bill,watts); 
							break;
		case "I","i":	industrial(bill,watts);
							break;
		}
		cs.close();
		sc.close();
	}

}
