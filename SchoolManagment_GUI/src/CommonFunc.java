public abstract class CommonFunc {
	protected String name,addr;
	protected int id,age,phone;
	
	CommonFunc(){}
	CommonFunc(String name,String addr,int id,int age,int phone){
		this.name = name;
		this.addr = addr;
		this.id = id;
		this.age = age;
		this.phone = phone;
	}
	
	void setName(String n) {this.name = n;}
	void setAddress(String n) {	this.addr = n;}
	void setId(int i) {this.id = i;}
	void setAge(int i) {this.age = i;}
	void setPhoneNumber(int i) {this.phone = i;}
	String getName () {return name;}
	String getAddress () {return addr;}
	int getId () {return id;}
	int getAge () {return age;}
	int getPhoneNumber () {return phone;}
	
	
}
