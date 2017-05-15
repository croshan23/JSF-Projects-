package com.udemyjsf1;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class student {
	String firstName;
	String lastName;
	String country;
	String fabLanguage;
	String[] fabMovie;
	List<String> countryOptions;

	public student() {
		firstName = "Roshan";
		lastName = "Chaudhary";
		fabLanguage = "Java";

		//loading list of countries
		countryOptions = new ArrayList<>();
		countryOptions.add("Nepal");
		countryOptions.add("India");
		countryOptions.add("Pakistan");
	}

	public List<String> getCountryOptions() {
		return countryOptions;
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
	public String getFabLanguage() {
		return fabLanguage;
	}

	public void setFabLanguage(String fabLanguage) {
		this.fabLanguage = fabLanguage;
	}

	public String[] getFabMovie() {
		return fabMovie;
	}

	public void setFabMovie(String[] fabMovie) {
		this.fabMovie = fabMovie;
	}	
}
