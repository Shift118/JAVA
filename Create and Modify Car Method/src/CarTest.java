
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("Pegout","508") , c2;
		c1.displayInfo();
		c1.modifyCar("302");
		c1.displayInfo();
		c2 = c1.createCar("Nissan", "GTR");
		c2.displayInfo();
	}

}
