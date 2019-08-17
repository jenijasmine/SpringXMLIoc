package com.demo;

public class Student {
	private String firstName;
	private String lastName;
	private int rollNo;
	
	public Student() {
		super();
	}
	public Student(String firstName, String lastName, int rollNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNo = rollNo;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getRollNo() {
		return rollNo;
	}
	
	
}
