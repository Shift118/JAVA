
public class Square {
	private int side;
	private String color;
	public Square() {
		side = 5;
		color = "red";
	}
	public Square(int side,String c) {
		this.side = side;
		this.color = c;
	}
	void setSide(int s) {
		this.side = s; 
	}
	void setColor(String c) {
		this.color = c; 
	}
	int getSide() {
		return this.side; 
	}
	String getColor() {
		return this.color; 
	}
	int getArea() {
		return (this.side)*(this.side);
	}
	int getPer() {
		return (this.side)*4;
	}
	void squarePrint(int i) {
		System.out.println("Square ("+(i+1)+"): Color = "+getColor()+" Area = "+getArea()+" Perimeter = "+getPer());
	}
	
}
