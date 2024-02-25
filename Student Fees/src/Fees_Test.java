
public class Fees_Test {

	public static void main(String[] args) {
		String name = "Mostafa",address = "San-Stefano";
		int id = 289,age = 20,phone=43;
		
		freshman f1 = new freshman(100);
		senior s1 = new senior(name,address,id,age,phone,100);
		junior j1 = new junior(name,address,id,age,phone,100);
		
		f1.print();
		j1.print();
		s1.print();
	}

}
