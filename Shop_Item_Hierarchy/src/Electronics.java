public class Electronics extends Item{
	String brand;
	Electronics(String name, double price,String brand) {
		super(name, price);
		this.brand = brand;
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Brand: "+brand);
	}

}
