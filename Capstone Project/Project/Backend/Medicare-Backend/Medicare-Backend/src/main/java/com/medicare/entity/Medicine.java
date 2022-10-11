package com.medicare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medicine {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)		// auto_increment 
private int mid;
private String mname;
private float price;
private int quantity;
private String url;
public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
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
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
@Override
public String toString() {
	return "Medicine [mid=" + mid + ", mname=" + mname + ", price=" + price + ", quantity=" + quantity + ", url=" + url
			+ "]";
}

}
