package com.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.springdemo.mvc.validation.CourseCode;

public class Customer {
	private String firstName;
	@NotNull(message="Is required")
	@Size(min=1, message="Is required")
	private String lastName;
	
	@NotNull(message="Is required")
	@Min(message="Must be greater or equal to zero.", value = 0)
	@Max(message="Must be equal or less than 10", value = 10)
	private Integer freePasses; // the Integer and no int is for type conversion and to require the input by using @NotNull
	
	@NotNull(message="Is required")
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="should be 5 characters")
	private String postalCode;
	
	@NotNull(message="Must not be empty")
	@CourseCode
	private String courseCode;
	
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
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
}
