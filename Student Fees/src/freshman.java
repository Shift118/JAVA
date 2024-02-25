public class freshman extends Student{
	protected double fees;
	public freshman(double fees) {this.fees = 300 ;}
	freshman(String name,String addr,int id,int age,int phone,double fees){
		super(name,addr,id,age,phone);
		this.fees = 300 ;
	}
	@Override
	double getFees() {
		return fees;
	}
	@Override
	void print() {
		System.out.println("Freshman Fees= "+getFees());
	}
}
