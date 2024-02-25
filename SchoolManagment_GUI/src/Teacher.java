public class Teacher extends CommonFunc{
	private double salary;
	private double score;
	Teacher (String name,String addr,int id,int age,int phone,double salary,double score){
		super(name,addr,id,age,phone);
		this.salary = salary;
		this.score = score;
		}
	@Override
	public String toString() {
		return "Name: "+name+" Address: "+addr+" ID: "+id+" Phone: "+phone+" Salary: "+salary+" Score: "+score;
	}
}
