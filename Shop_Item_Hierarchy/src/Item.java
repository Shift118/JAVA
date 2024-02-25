public class Item {
	String name;
	double price;
	Item(String name,double price){
		this.name = name;
		this.price = price;
	}
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Price: "+price);
	}
}
