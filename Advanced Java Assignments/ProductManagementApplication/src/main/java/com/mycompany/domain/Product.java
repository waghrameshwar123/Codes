package com.mycompany.domain;

public class Product {

private int pid;
private String pname;
private int pprice;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getPprice() {
	return pprice;
}
public void setPprice(int pprice) {
	this.pprice = pprice;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + "]";
}
public Product(int pid, String pname, int pprice) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.pprice = pprice;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}


}
