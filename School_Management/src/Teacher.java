import java.util.List;

public class Teacher extends CommonFunc{
	Teacher (String name,String addr,int id,int age,int phone,List<Course> courses){
		super(name,addr,id,age,phone);
		super.courses = courses;
	}
}
