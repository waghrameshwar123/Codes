package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Product {
@Id
private int id;
private String name;
private float price;
private int quantity;
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
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
}
public Product(int id, String name, float price, int quantity) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.quantity = quantity;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}




}
