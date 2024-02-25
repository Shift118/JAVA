public class senior extends Student{
	protected double fees;
	senior(double fees){this.fees = fees;}
	senior(String name,String addr,int id,int age,int phone,double fees){
		super(name,addr,id,age,phone);
		this.fees = fees;
	}
	@Override
	double getFees() {
		return fees*1.2;
	}
	@Override
	void print() {
		System.out.println("Senior Fees= "+ getFees());
	}
}
