package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="stu_rest")
public class Student {

	@Id
	@Column
	private int id;
	@Column(length=20)
	private String first_Name;
	
	@Column(length=20)
	private String last_Name;
	
	@Column(length=20)
	private String addr;
	
	@Column
	private double salary;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String first_Name, String last_Name, String addr, double salary) {
		super();
		this.id = id;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.addr = addr;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", first_Name=" + first_Name + ", last_Name=" + last_Name + ", addr=" + addr
				+ ", salary=" + salary + "]";
	}
	
	 

	
}
