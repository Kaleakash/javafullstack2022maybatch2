package com;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DemoTest {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\Desktop\\Java Full Stack may 2022 Batch 2\\Phase 5\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		//WebDriver wd = new EdgeDriver();
		//WebDriver wd = new InternetExplorerDriver();
		//WebDriver wd = new OperaDriver();
	wd.get("file:///D:/Desktop/Java%20Full%20Stack%20may%202022%20Batch%202/Phase%205/Programs/UI%20Pages/index.html"); // static page path 
	//wd.get("http://127.0.0.1:5500/index.html");		// page running on server 
	//wd.get("https://www.google.com/");	                // live page url 
	//System.out.println("web page loaded succesfully...");
	
	String title=	wd.getTitle();
	System.out.println(title);
	String url = wd.getCurrentUrl();
	System.out.println(url);
	WebElement pTag	= wd.findElement(By.tagName("p"));
	System.out.println(pTag.getText());
	
	WebElement h1Tag	= wd.findElement(By.tagName("h1"));
	System.out.println(h1Tag.getText());
	
	
	WebElement divTag	= wd.findElement(By.tagName("div"));
	System.out.println(divTag.getText());
	
	WebElement pId1Tag = wd.findElement(By.id("p1"));
	WebElement pId2Tag = wd.findElement(By.id("p2"));
	System.out.println(pId1Tag.getText());
	System.out.println(pId2Tag.getText());

	WebElement pClass1Tag = wd.findElement(By.className("abc"));
	WebElement pClass2Tag = wd.findElement(By.className("xyz"));
	System.out.println(pClass1Tag.getText());
	System.out.println(pClass2Tag.getText());
	
	
	List<WebElement> allPTag = wd.findElements(By.tagName("p"));
	System.out.println("All p tag values");
	Iterator<WebElement> li = allPTag.iterator();
	while(li.hasNext()) {
		WebElement ll = li.next();
		System.out.println(ll.getTagName()+" "+ll.getText());
	}
	
	
	//String pageInfo	 = wd.getPageSource();
	//System.out.println(pageInfo);
	
	wd.close();
	}

}


