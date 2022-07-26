package com;

public class Order {
private int oid;
private String orderDetails;
public int getOid() {
	return oid;
}
public void setOid(int oid) {
	this.oid = oid;
}
public String getOrderDetails() {
	return orderDetails;
}
public void setOrderDetails(String orderDetails) {
	this.orderDetails = orderDetails;
}
@Override
public String toString() {
	return "Order [oid=" + oid + ", orderDetails=" + orderDetails + "]";
}

}
