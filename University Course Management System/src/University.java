import java.util.Arrays;

public class University {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniversityCourse c1 = new UniversityCourse(
				"ECE211",
				"Electronics",
				Arrays.asList("Mostafa Younes","Mina Ramsis"),
				20,
				Arrays.asList("A")
				);
		c1.enrollStudent("Hamza Mohamed");
		c1.enrollStudent("Mostafa Younes");
		c1.displayCourseInfo();
	}

}
