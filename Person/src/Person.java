public class Person {
	private String first_name,middle_name,last_name;
	Person(String first_name,String middle_name,String last_name){
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
	}
	void setFirst(String fName) {
		first_name = fName;
	}
	void setMiddle(String mName) {
		middle_name = mName;
	}
	void setLast(String lName) {
		last_name = lName;
	}
	
	boolean checkFirstName(String fName) {
		return this.first_name.equalsIgnoreCase(fName);
	}
	boolean checklastName(String lName) {
		return this.last_name.equalsIgnoreCase(lName);
	}
	boolean checkMiddleName(String mName) {
		return this.middle_name.equalsIgnoreCase(mName);
	}
	boolean checkName(String fName,String mName,String lName) {
		return first_name.equalsIgnoreCase(fName) && middle_name.equalsIgnoreCase(mName) && last_name.equalsIgnoreCase(lName);
	}
	
	void makeCopy(Person c) {
		this.first_name = c.first_name;
		this.middle_name = c.middle_name;
		this.last_name = c.last_name;
	}
	Person getCopy() {
		return new Person(this.first_name,this.middle_name,this.last_name);
		
	}
	void getName() {
		System.out.println("Name: "+first_name+" "+middle_name+" "+last_name);
	}
	
}
