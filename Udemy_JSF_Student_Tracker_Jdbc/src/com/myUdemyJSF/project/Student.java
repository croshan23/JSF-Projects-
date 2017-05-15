package com.myUdemyJSF.project;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {

	private int id;
	private String firstName, lastName, email;
	
	public Student(){
		
	}
	
	public Student(int id, String fname, String lname, String email){
		this.id = id;
		this.firstName = fname;
		this.lastName = lname;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString(){
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + "]";
	}
}
