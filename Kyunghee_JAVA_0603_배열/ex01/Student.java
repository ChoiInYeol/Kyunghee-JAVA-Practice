package ex01;
public class Student {
	// 생성자
	public Student(String a, int b) {
		studentName = "최인열";
		studentID = 2018102147;
	}
	// 멤버 변수
	private String studentName;
	private int studentID;
	// Getter 메소드
	String getName() {return studentName;}
	int getID() {return studentID;}
}
