package com.model;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ParallelTestDemo
{
  public WebDriver driver;	
  @Test
  public void openBrowser() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Testing\\Chrome76\\chromedriver.exe");
	  driver=new ChromeDriver();
	  System.out.println("ChromeBrowser is opened Successfully");
	  System.out.println("Chrome Thread Details are "+Thread.currentThread().getId());
	  System.out.println("Chrome Thread Details are "+Thread.currentThread().getId());
  }
  
  @Test
  public void InternetBrowser() {
	  System.setProperty("webdriver.ie.driver", "F:\\Testing\\IEDriverServer_x64_3.14.0 (12)\\IEDriverServer.exe");
	  driver=new InternetExplorerDriver();
	  System.out.println("InternetBrowser is opened Successfully");
	  System.out.println("Internet Thread Details are "+Thread.currentThread().getId());
	  System.out.println("Internet Thread Details are "+Thread.currentThread().getId());
	  System.out.println("Internet Thread Details are "+Thread.currentThread().getId());
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("In before Method: ");
	  System.out.println("In beforeMethod: "+Thread.currentThread().getId());
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("In after Method: ");
	  System.out.println("In after Method: "+Thread.currentThread().getId());
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("In before Test");
	  System.out.println("In before test: "+Thread.currentThread().getId());
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("In after Test: ");
	  System.out.println("In after Test: "+Thread.currentThread().getId());
  }

}
