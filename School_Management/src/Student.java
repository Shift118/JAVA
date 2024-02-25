import java.util.List;

public class Student extends CommonFunc{
	private double grade;
	Student (String name,String addr,int id,int age,int phone,double grade,List<Course> courses){
		super(name,addr,id,age,phone);
		this.grade = grade;
		super.courses = courses;
	}
}
