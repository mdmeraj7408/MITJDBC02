package com.java.test;

public class Student {
	private int studentId;
	private String studentNmae;
	private String studentPhone;
	private String studentCity;
	public Student(int studentId, String studentNmae, String studentPhone, String studentCity) {
		super();
		this.studentId = studentId;
		this.studentNmae = studentNmae;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}
	public Student(String studentNmae, String studentPhone, String studentCity) {
		super();
		this.studentNmae = studentNmae;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}
	public Student() {
		super();
	}

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentNmae() {
		return studentNmae;
	}
	public void setStudentNmae(String studentNmae) {
		this.studentNmae = studentNmae;
	}
	public String getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

}
