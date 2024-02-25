
public class Car {
	private String brand,model;
	Car(String brand,String model){
		this.brand = brand;
		this.model = model;
	}
	void displayInfo() {
		System.out.println("Brand: "+brand+" Model: "+model);
	}
	void modifyCar (String newModel) {
		this.model = newModel;
	}
	Car createCar(String brand,String model) {
		Car c = new Car(brand,model);
		return c;
	}
}
