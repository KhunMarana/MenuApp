package com.venkadesh.vkfast_food;

public class Ingredients {
	
	private int id;
	private String name;
	private double prices;
	private String des;
	
	
	public Ingredients(int id, String name, double prices, String des) {
		super();
		this.id = id;
		this.name = name;
		this.prices = prices;
		this.des = des;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrices() {
		return prices;
	}
	public void setPrices(double prices) {
		this.prices = prices;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}


}
