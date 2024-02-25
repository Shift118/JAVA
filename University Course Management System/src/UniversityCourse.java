import java.util.ArrayList;
import java.util.List;

public class UniversityCourse {
	private String courseCode,courseName;
	private List <String> instructors = new ArrayList <String>(); 
	private ArrayList <String> enrolledStudents = new ArrayList<String>(); 
	private List <String> assessments = new ArrayList<String>(); 
	private int maxStudents;

	public UniversityCourse() {
		courseCode = "";
		courseName = "";
		maxStudents = 0;
	}
	public UniversityCourse(String courseCode,String courseName) {
		this.courseCode = courseCode;
		this.courseName = courseName;
	}
	public UniversityCourse(String courseCode,String courseName,List <String> instructors,int maxStudents) {
		this(courseCode,courseName);
		this.instructors = instructors;
		this.maxStudents = maxStudents;
	}
	public UniversityCourse(String courseCode,String courseName,List<String> instructors,int maxStudents,List<String> assessments) {
		this(courseCode,courseName,instructors,maxStudents);
		this.assessments = assessments;
	}
	
	void enrollStudent(String studentName) {
		if(this.enrolledStudents.size() < maxStudents) {
			this.enrolledStudents.add(studentName);
		}
	}
	void displayCourseInfo() {
		System.out.print("Course Code: " + courseCode);
		System.out.print("\nCourse Name: " + courseName);
		System.out.print("\nInstructors:");
		for (int i = 0 ; i < instructors.size() ; i++) {
			System.out.print(" "+instructors.get(i));
		}
		System.out.print("\nMaximum Students: "+maxStudents);
		System.out.print("\nEnrolled Students: ");
		for (int i = 0 ; i < enrolledStudents.size() ; i++) {
			System.out.print("\n("+(i+1)+") -> "+enrolledStudents.get(i));
		}
		System.out.print("\nAssessments: ");
		for (int i = 0 ; i < assessments.size() ; i++) {
			System.out.print(" "+assessments.get(i));
		}
	}
	
	
}