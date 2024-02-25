public class EmpClass {
	private String name;
	private String empDesignation;
	private int empAge,empSalary;
	public EmpClass(String n) {
		this.name = n;
	}
	public void setAge(int age) {
		this.empAge = age;
	}
	void setDesignation(String designation) {
		this.empDesignation = designation;
	}
	void setSalary(int s) {
		this.empSalary = s;
	}
	void printEmployee() {
		System.out.println("Name: "+ this.name);
		System.out.println("Age: "+ this.empAge);
		System.out.println("Designation: "+ this.empDesignation);
		System.out.println("Salary: "+ this.empSalary);
	}
}
