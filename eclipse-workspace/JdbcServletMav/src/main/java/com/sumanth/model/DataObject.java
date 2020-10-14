package com.sumanth.model;

public class DataObject {
	
	String name;
	int id;
	String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "DataObject [name=" + name + ", id=" + id + ", city=" + city + "]";
	}
	
	

}
