import java.time.LocalDate;

public class Food extends Item{
	
	String expirationDate;
	Food(String name, double price,String expirationDate) {
		super(name, price);
		this.expirationDate = expirationDate;
	} 
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Expiration Date: "+expirationDate);
	}
	public void checkExpiration() {
		LocalDate dt1 = LocalDate.parse(expirationDate);
		LocalDate now = LocalDate.now();
		if (now.isAfter(dt1)) System.out.println("Food has Expired!");
		else System.out.println("Food is Good!");
	}
	
}
