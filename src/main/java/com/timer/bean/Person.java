package com.timer.bean;

import java.util.Date;

public class Person {
	private String personName;
	private Integer personAge;
	private Date personBirth;
	private String personLocation;
	private Car personCar;
	
	
	public Person() {
		super();
	}
	public Person(String personName, Integer personAge, Date personBirth, String personLocation, Car personCar) {
		super();
		this.personName = personName;
		this.personAge = personAge;
		this.personBirth = personBirth;
		this.personLocation = personLocation;
		this.personCar = personCar;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public Integer getPersonAge() {
		return personAge;
	}
	public void setPersonAge(Integer personAge) {
		this.personAge = personAge;
	}
	public Date getPersonBirth() {
		return personBirth;
	}
	public void setPersonBirth(Date personBirth) {
		this.personBirth = personBirth;
	}
	public String getPersonLocation() {
		return personLocation;
	}
	public void setPersonLocation(String personLocation) {
		this.personLocation = personLocation;
	}
	public Car getPersonCar() {
		return personCar;
	}
	public void setPersonCar(Car personCar) {
		this.personCar = personCar;
	}
	
}
