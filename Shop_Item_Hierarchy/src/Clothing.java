public class Clothing extends Item {
	String size;
	String fabric;
	Clothing(String name, double price,String size,String fabric) {
		super(name, price);
		this.size = size;
		this.fabric = fabric;
		adjustPriceBasedOnFabric();
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Size: " + size);
		System.out.println("Fabric: "+ fabric);
	}
	public void adjustPriceBasedOnFabric() {
		switch(fabric.toLowerCase()) {
		case "cotton": super.price += super.price*0.1; break;
		case "linen": super.price += super.price*0.3; break;
		case "wool": super.price += super.price*0.2; break;
		case "silk": super.price += super.price*0.2; break;
		default: throw new IllegalArgumentException("Invalid Fabric Type!");
		}
	}
}
