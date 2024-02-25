public class CargoShip extends Ship{
	int capacity;
	public CargoShip() {}
	public CargoShip(String Name,String Year,int c) {
		super(Name,Year);
		capacity = c;
	}
	void setCapacity(int n) {
		capacity = n;
	}
	int getCapacity() {
		return capacity;
	}
	@Override public String toString() {
		return "Name: "+ getName() + "\tCargo Capacity: " + getCapacity() ;
	}
}
