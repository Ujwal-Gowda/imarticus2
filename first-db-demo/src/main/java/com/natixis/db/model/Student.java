package com.natixis.db.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student{
	
	@Id
	private int id;
	private String name;
	private	int marks;
	private int fee;
	public Student() {
		super();
	}
	public Student(int id, String name, int marks, int fee) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.fee = fee;
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", fee=" + fee + "]";
	}
	
	
	
	
}
