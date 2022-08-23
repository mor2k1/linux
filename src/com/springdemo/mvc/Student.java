package com.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String programmingLanguage;
	private String[] operatingSystem;
	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> favoriteLanguage;
	
	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("ISR", "Israel");
		countryOptions.put("FRA", "France");
		countryOptions.put("ENG", "England");
		countryOptions.put("GER", "Germany");
		
		favoriteLanguage = new LinkedHashMap<>();
		favoriteLanguage.put("Java", "Java");
		favoriteLanguage.put("Python", "Python");
		favoriteLanguage.put("PHP", "PHP");
		favoriteLanguage.put("NodeJS", "NodeJS");
		
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}

	public LinkedHashMap<String, String> getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
	
}
