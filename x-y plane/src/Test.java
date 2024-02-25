public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(1,1);
		Circle c1 = new Circle(1,1,5);
		Cylinder cy1 = new Cylinder(c1,15);
		System.out.println(p1);
		c1.printArea();
		c1.printPer();
		cy1.printSurfaceArea();
		cy1.printVolume();
	}
}
