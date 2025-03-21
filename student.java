
package com.backend.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private String rollnumber;
	private int mobilenumber;
	private String email;
	private String branch;
	public int getId() {
		return id; 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(String rollnumber) {
		this.rollnumber = rollnumber;
	}
	public int getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String rollnumber, int mobilenumber, String email, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.rollnumber = rollnumber;
		this.mobilenumber = mobilenumber;
		this.email = email;
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollnumber=" + rollnumber + ", mobilenumber=" + mobilenumber
				+ ", email=" + email + ", branch=" + branch + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getRollnumber()=" + getRollnumber() + ", getMobilenumber()=" + getMobilenumber() + ", getEmail()="
				+ getEmail() + ", getBranch()=" + getBranch() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
