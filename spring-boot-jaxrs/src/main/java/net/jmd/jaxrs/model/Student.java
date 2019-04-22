package net.jmd.jaxrs.model;

import java.time.LocalDate;

public class Student {

	Long id;
    String firstName;
    String lastName;
    String year;
    boolean active;
    LocalDate enrolmentDate;
    
	public Student(Long id, String firstName, String lastName, String year, boolean active, LocalDate enrolmentDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.year = year;
		this.active = active;
		this.enrolmentDate = enrolmentDate;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public LocalDate getEnrolmentDate() {
		return enrolmentDate;
	}
	public void setEnrolmentDate(LocalDate enrolmentDate) {
		this.enrolmentDate = enrolmentDate;
	}
    
}
