public class Circle extends Point {
	private double radius;
	public Circle () {}
	public Circle (double x, double y,double r) {
		super(x,y);
		radius = r;
	}
	double getRadius() {
		return radius;
	}
	void setRadius(double r) {
		this.radius = r;
	}
	void radiusPrint(){
		System.out.println("Radius= "+radius);
	}
	double getArea() {
		double area = Math.pow(Math.PI, 2) * radius;
		return area;
	}
	void printArea() {
		System.out.println("Area= "+getArea());
	}
	double getPer() {
		double per = 2*Math.PI *radius;
		return per;
	}
	void printPer() {
		System.out.println("Perimeter= "+getPer());
	}
}
