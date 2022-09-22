package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;


public class IndexPageTesting {
  WebDriver wd;
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Desktop\\Java Full Stack may 2022 Batch 2\\Phase 5\\chromedriver_win32\\chromedriver.exe");
	  System.out.println("loaded...");
	  wd = new ChromeDriver();
	  wd.get("http://127.0.0.1:5500/index.html"); 
  }
  @Test
  public void titleTagTest() {
	  String title = wd.getTitle();
	  assertEquals(title, "Document");
	  System.out.println("testing");
  }
  @Test
  public void divTagTest() {
	  WebElement divTag = wd.findElement(By.tagName("div"));
	  assertEquals(divTag.getText(), "This is div tag");
  }  
  @Test
  public void pTagTest() {
	  WebElement firstPTag = wd.findElement(By.tagName("p"));
	  assertEquals(firstPTag.getText(), "Welcome to Simple Selenium Testing");
	  List<WebElement> listOfP = wd.findElements(By.tagName("p"));
	  assertEquals(6, listOfP.size());
	  WebElement thirdPTag  = listOfP.get(2);
	  assertEquals(thirdPTag.getText(), "This is second p tag");
  } 
  @AfterClass
  public void afterClass() {
	  wd.close();
  }


}
