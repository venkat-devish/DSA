package oops.ninjas;

public class Student {
	public String name;
	final private int rollNumber;
	double cgpa;
	public final static double CONVERSION_FACTOR = 0.95;
	private static int numStudents;

	public Student() {
		this.name = "abc";
		this.rollNumber = numStudents;
	}

	public Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}

	public Student(String name) {
		this.name = name;
		numStudents++;
		this.rollNumber = numStudents;
	}

	public void getStudentCount() {
		System.out.println(Student.numStudents);
	}
//
//	public void setRollNumber(int rollNumber) {
//		this.rollNumber = rollNumber;
//	}

	public void getRollNumber() {
		System.out.println(rollNumber);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getName() {
		System.out.println(name);
	}

	public void print() {
		System.out.println(name + " " + rollNumber);
	}
}
