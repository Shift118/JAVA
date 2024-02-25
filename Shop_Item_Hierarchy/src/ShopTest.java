public class ShopTest {
	public static void main(String[] args) {
		Item i1 = new Item("Mostafa",99);
		Electronics e1 = new Electronics("Mostafa",99,"Atmega");
		Clothing c1 = new Clothing("Mostafa",99,"XLL","wool");
		Food f1 = new Food("Mostafa",99,"2024-12-12");
		i1.displayDetails();
		System.out.println("##########");
		e1.displayDetails();
		System.out.println("##########");
		c1.displayDetails();
		System.out.println("##########");
		f1.displayDetails();
		System.out.println("##########");
		f1.checkExpiration();
		System.out.println("##########");
	}

}
