public class Cylinder extends Circle{
	private double height;
	private double baseRadius;
	public Cylinder() {}
	public Cylinder(Circle r,double h) {
		height = h;
		baseRadius = r.getRadius();
	}
	void setBaseRadius(double b) {
		baseRadius = b;
	}
	void setHeight(double h) {
		height = h;
	}
	double getBaseRadius() {
		return baseRadius;
	}
	double getHeight() {
		return height;
	}
	double getVolume() {
		double vol = Math.PI * Math.pow(baseRadius, 2) * height;
		return vol;
	}
	void printVolume() {
		System.out.println("Volume = "+getVolume());
	}
	double surfaceArea() {
		double surfArea = 2*Math.PI*baseRadius*height + 2* Math.PI * Math.pow(baseRadius, 2);
		return surfArea;
	}
	void printSurfaceArea() {
		System.out.println("Surface Area = "+ surfaceArea());
	}
}

