public class junior extends Student{
	protected double fees;
	junior(double fees){this.fees = fees;}
	junior(String name,String addr,int id,int age,int phone,double fees){
		super(name,addr,id,age,phone);
		this.fees = fees;
	}
	@Override
	double getFees() {
		return fees*1.3;
	}
	@Override
	void print() {
		System.out.println("Junior Fees= "+ getFees());
	}
}
