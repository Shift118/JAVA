public class Ship {
	String name;
	String year;
	public Ship() {}
	public Ship(String n,String y) {
		name = n;
		year = y;
	}
	void setName(String n) {
		name = n;
	}
	void setYear(String y) {
		year = y;
	}
	String getName() {
		return name;
	}
	String getYear() {
		return year;
	}
	public String toString() {
		return "Name: " +getName() +"\tYear: "+ getYear();
	}
}
