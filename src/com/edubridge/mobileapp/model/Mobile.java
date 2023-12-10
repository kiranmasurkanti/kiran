package com.edubridge.mobileapp.model;

public class Mobile {
	private String Brand;
	private String color;
	private String camera;
	private double price;
	
	
	public Mobile() {
		super();
	}
	public Mobile(String brand, String color, String camera, double price) {
		super();
		Brand = brand;
		this.color = color;
		this.camera = camera;
		this.price = price;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mobile [Brand=" + Brand + ", color=" + color + ", camera=" + camera + ", price=" + price + "]";
	}
	
	
	
}
