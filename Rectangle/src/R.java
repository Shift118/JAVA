
public class R {
	private double length;
	private double width;
	public R(){
		double le = 12;
		double wi = 12;
	}
	public void setlength(double le) {
		length = le;
	}
	public void setwidth(double wi) {
		width = wi;
	}
	public void getarea () {
		System.out.println("Area = "+(length* width)+" m^2");
	}
}
