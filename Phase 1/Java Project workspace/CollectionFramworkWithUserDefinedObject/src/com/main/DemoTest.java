package com.main;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.bean.Product;
import com.service.ProductService;

public class DemoTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String con="";
		ProductService ps = new ProductService();
		int pid;
		String pname;
		float price;
			do {
				System.out.println("1:Add 2:Display");
				System.out.println("Enter your choice");
				int ch = sc.nextInt();
				switch(ch) {
				case 1:System.out.println("Enter the pid");
				        pid = sc.nextInt();
				        System.out.println("Enter the name");
				        pname = sc.next();
				        System.out.println("Enter the price");
				        price = sc.nextFloat();
				        Product p = new Product(pid, pname, price);
				        String res1 = ps.addProduct(p);
				        System.out.println(res1);
						break;
				case 2: List<Product> listOfProdct = ps.getAllProduct();
				        Iterator<Product> li = listOfProdct.iterator();
				        while(li.hasNext()) {
				        	Product pp = li.next();
				        	System.out.println("Pid "+pp.getPid()+" PName is "+pp.getPname()+"Price "+pp.getPrice());
				        }
						break;
				}
				System.out.println("do you want to continue?");
				con = sc.next();
			}while(con.equals("y"));
		System.out.println("Thank you");
	}

}
