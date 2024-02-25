public class Point {
	private double x,y;

	public Point() {	}
	public Point(double x,double y) {
		this.x = x;
		this.y = y;
	}
	void setX(double x) {
		this.x = x;
	}
	void setY(double y) {
		this.y = y;
	}
	double getX() {
		return x;
	}
	double getY() {
		return y;
	}
	public String toString() {
		return "X: "+getX()+"\tY: "+getY();
	}
}

