package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component							//<bean class="com.Address"></bean> by default id name is class name
public class Address {				// according to camel naming rule. 
@Value(value = "Bangalore")
private String city;
@Value(value = "Kar")
private String state;
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + "]";
}

}
