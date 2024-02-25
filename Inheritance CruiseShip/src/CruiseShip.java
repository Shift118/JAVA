public class CruiseShip extends Ship {
	int maxNumber;
	public CruiseShip() {}
	public CruiseShip(String Name,String Year,int x) {
		super(Name,Year);
		maxNumber = x;
	}
	void setMaxNumber(int n) {
		maxNumber = n;
	}
	int getMaxNumber() {
		return maxNumber;
	}
	@Override public String toString() {
		return "Name: "+ getName() + "\tMaximum Number of Passengers" + getMaxNumber() ;
	}
}
