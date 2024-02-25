import java.util.List;

public class Add implements UserArray{
	Add(String name,String addr,int id,int age,int phone,double grade,List<Course> courses){
		Student s = new Student(name,addr,id,age,phone,grade,courses);
		students.add(s);
	}
	Add(String name,String addr,int id,int age,int phone,List<Course> courses){
		Teacher t = new Teacher(name,addr,id,age,phone,courses);
		teachers.add(t);
	}
}
