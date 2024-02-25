public class Add implements UserArray{
	Add(String name,String addr,int id,int age,int phone,double grade){
		Student s = new Student(name,addr,id,age,phone,grade);
		students.add(s);
	}
	Add(String name,String addr,int id,int age,int phone,double salary,double score){
		Teacher t = new Teacher(name,addr,id,age,phone,salary,score);
		teachers.add(t);
	}
}
