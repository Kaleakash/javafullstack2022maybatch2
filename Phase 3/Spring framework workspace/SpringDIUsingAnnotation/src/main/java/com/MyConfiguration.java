package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration								// beans.xml file 
@ComponentScan(basePackages = "com")   //<context:component-scan base-package="com"></context:component-scan>
public class MyConfiguration {

	
	@Bean(name = "pp")							// this method help to create the object 
	public Product getProductInstance() {		// explicitly by us but maintain by container. 
		Product pp = new Product();
		return pp;
	}
	@Bean(name="oo")
	public Order getOrderInstance() {
		Order o= new Order();
		return o;
	}
}
