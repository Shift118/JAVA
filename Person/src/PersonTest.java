
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("m","y","m");
		Person p2 = new Person("x","u","x");
		p1.makeCopy(p2);
		p1.getName();
		System.out.println(p1.getCopy());
	}
}
