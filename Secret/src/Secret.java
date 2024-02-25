
public class Secret {
	private String name;
	private int age;
	private int weight;
	private double height;
	void print() {
		System.out.println("Name: "+name+" Age: "+age+" Weight: "+weight+" Height: "+height);
	}
	void setName(String n) {
		name = n;
	}
	void setAge(int a) {
		age = a;
	}
	void setWeight(int w) {
		weight = w;
	}
	void setHeight(int h) {
		height = h;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	int getWeight() {
		return weight;
	}
	double getHeight() {
		return height;
	}
}
