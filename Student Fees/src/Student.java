public abstract class Student {
	protected String address,name;
	protected int id,age,phoneNumber;
	public Student() {	}
	Student(String name,String addr,int id,int age,int phone){
		this.name = name;
		this.address = addr;
		this.id = id;
		this.age = age;
		this.phoneNumber = phone;
	}
	void setName(String n) {this.name = n;}
	void setAddress(String n) {	this.address = n;}
	void setId(int i) {this.id = i;}
	void setAge(int i) {this.age = i;}
	void setPhoneNumber(int i) {this.phoneNumber = i;}
	String getName () {return name;}
	String getAddress () {return address;}
	int getId () {return id;}
	int getAge () {return age;}
	int getPhoneNumber () {return phoneNumber;}
	
	abstract double getFees();
	
	void print() {
		System.out.println("Name: "+name+" ID: "+id+" Age: "+age);
		System.out.println("Address: "+address+" PhoneNumber: "+phoneNumber);
	}
}
