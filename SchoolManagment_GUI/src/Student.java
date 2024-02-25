public class Student extends CommonFunc{
	private double grade;
	Student (String name,String addr,int id,int age,int phone,double grade){
		super(name,addr,id,age,phone);
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Name: "+name+" Address: "+addr+" ID: "+id+" Phone: "+phone+" Grade: "+grade;
	}
}
