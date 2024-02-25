import java.util.Date;

public class SaloonTest {
	public static void main(String[] args) {
		Date date = new Date();
		Customer c1 = new Customer("Mostafa Younes");
		Customer c2 = new Customer("Ahmed Waleed");
		Customer c3= new Customer("Gamil Nabil");
		Customer nonMember= new Customer("Shehab Mohamed");
		c1.setMemberType("Premium");
		c1.setMember(true);
		c2.setMemberType("Gold");
		c2.setMember(true);
		c3.setMemberType("Silver");
		c3.setMember(true);
		
		Visit v1 = new Visit(c1,date);
		Visit v2 = new Visit(c2,date);
		Visit v3 = new Visit(c3,date);
		Visit v4 = new Visit(nonMember,date);
		v1.setServiceExpense(300);
		v2.setServiceExpense(1000);
		v3.setServiceExpense(540);
		v4.setServiceExpense(999);
		v1.setProductExpense(300);
		v2.setProductExpense(1000);
		v3.setProductExpense(540);
		v4.setProductExpense(999);
		
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		System.out.println(v3.toString());
		System.out.println(v4.toString());
	}
}
