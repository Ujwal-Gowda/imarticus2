package com.natixis.crud.model;

public class Student {
	
	private int id;
	private String name;
	private float fees;
	private int marks;
	
	public Student() {
		super();
	
	}
	public Student(int id, String name, float fees, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.marks = marks;
	}

	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fees=" + fees + ", marks=" + marks + "]";
	}
	

}
