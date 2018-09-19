package com.timer.bean;

public class Car {
	private String carName;
	private Double carPrice;
	private String brand;
	private Integer wheels;
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public Double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(Double carPrice) {
		this.carPrice = carPrice;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getWheels() {
		return wheels;
	}
	public void setWheels(Integer wheels) {
		this.wheels = wheels;
	}
	public Car(String carName, Double carPrice, String brand, Integer wheels) {
		super();
		this.carName = carName;
		this.carPrice = carPrice;
		this.brand = brand;
		this.wheels = wheels;
	}
	public Car() {
		super();
	}
	
	
}
