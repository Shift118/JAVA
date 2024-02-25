public class QuadraticEquations {
	private double a,b,c;
	public QuadraticEquations() {
		this.a = 0;
		this.b = 0;
		this.c = 0;
	}
	void setA(double a) {
		this.a = a;
	}
	void setB(double b) {
		this.b = b;
	}
	void setC(double c) {
		this.c = a;
	}
	double getA() {
		return a;
	}
	double getB() {
		return b;
	}
	double getC() {
		return c;
	}
	double getDiscriminant() {
		return (Math.pow(b,2)-4*a*c);
	}
	double getRoot1() {
		if (getDiscriminant()>0) {
			return ((-b) + Math.sqrt(Math.pow(b, 2)-4*a*c)) / (2*a);
		}else { return 0; }
	}
	double getRoot2() {
		if (getDiscriminant()>0) {
			return ((-b) - Math.sqrt(Math.pow(b, 2)-4*a*c)) / (2*a);
		}else { return 0; }
	}
	void printRoots() {
		System.out.println("#################");
		if(getDiscriminant() > 0) {
			System.out.println("Root1 = "+getRoot1()+"\nRoot2 = "+getRoot2());
		}else {
			System.out.println("The equation has no roots.");
		}
	}
}
