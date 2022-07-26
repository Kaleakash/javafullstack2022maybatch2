package com;

import org.springframework.beans.factory.annotation.Autowired;

public class Product {
private int pid;
private String pname;
private float price;
@Autowired
private Order oo;

public Order getOo() {
	return oo;
}
public void setOo(Order oo) {
	this.oo = oo;
}
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
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", oo=" + oo + "]";
}

}
