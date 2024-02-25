public class ShipTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ship s1 = new Ship("Titanic","1912");
		System.out.println(s1);
		CruiseShip c1 = new CruiseShip("Falcone13","1919",2000);
		System.out.println(c1.toString());
		CargoShip car1 = new CargoShip("Falcone9","1909",90000); 
		System.out.println(car1.toString());
	}
}
