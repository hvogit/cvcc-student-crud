package com.cinglevue.codechallenge.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Document(collection = "students")
public class Student {

	@Id
	private String id;
	private String studentNumber;
	private String gender;
	
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private Date birthDate;
	
	private Boolean disability;
	private String firstName;
	private String lastName;
	private String email;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Boolean getDisability() {
		return disability;
	}
	public void setDisability(Boolean disability) {
		this.disability = disability;
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
	public String toString() {
		return String.format("Student [id=%s, studentNumber=%s, gender=%s, birthDate=%s, disability=%s, firstName=%s, lastName=%s, email=%s]", id, studentNumber, gender,
				birthDate, disability, firstName, lastName, email);
	}
}