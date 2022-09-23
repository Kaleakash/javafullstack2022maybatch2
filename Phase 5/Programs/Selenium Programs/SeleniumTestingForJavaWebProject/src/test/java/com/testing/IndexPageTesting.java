package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class IndexPageTesting {
	WebDriver wd;
  @Test
  public void indexPageTesting() {
	  //String title = wd.getTitle();
	  //System.out.println(title);
	  WebElement emailId = wd.findElement(By.name("emailid"));		// got the reference of emaiid field 
	  WebElement password = wd.findElement(By.name("password"));	// got the reference of password field 
	  emailId.sendKeys("seeta@gmail.com");						// set emaild email field 
	  password.sendKeys("000");								// set password in password field 
	  
	  List<WebElement> listOfButton = wd.findElements(By.tagName("input"));
	  WebElement submitButton = listOfButton.get(2);
	  submitButton.click();
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Desktop\\Java Full Stack may 2022 Batch 2\\Phase 5\\chromedriver_win32\\chromedriver.exe");
	  System.out.println("loaded...");
	  wd = new ChromeDriver();
	  wd.get("http://localhost:8080/MVC_Application/"); 
  }

  @AfterClass
  public void afterClass() {
	  //wd.close();
  }

}
