package com.entity;

import java.sql.Timestamp;

public class Users {
String first_name;
String address;
String email;
String user_name;
String password;
Timestamp registration_date;
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Timestamp getRegistration_date() {
	return registration_date;
}
public void setRegistration_date(Timestamp registration_date) {
	this.registration_date = registration_date;
}
@Override
public String toString() {
	return "Users [first_name=" + first_name + ", address=" + address + ", email=" + email + ", user_name=" + user_name
			+ ", password=" + password + ", registration_date=" + registration_date + "]";
}
public Users(String first_name, String address, String email, String user_name, String password,
		Timestamp registration_date) {
	super();
	this.first_name = first_name;
	this.address = address;
	this.email = email;
	this.user_name = user_name;
	this.password = password;
	this.registration_date = registration_date;
}
public Users(String first_name, String address, String email, String user_name, String password) {
	super();
	this.first_name = first_name;
	this.address = address;
	this.email = email;
	this.user_name = user_name;
	this.password = password;
}
public Users() {
	super();
	// TODO Auto-generated constructor stub
}



}
