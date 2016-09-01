package com.baidu.test;

import org.testng.annotations.Test;

import com.baidu.basepage.Index;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class Testlink {
	WebElement element;
  @Test
  public void f() {
	  element=Index.getElement("new");
	  if(element!=null)
	  {
		  element.click();
	  }else{
		 
		  MyAlert.startAlert(Index.driver);
		  
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  Index.startURL();
  }

  @AfterTest
  public void afterTest() {
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  Index.driver.close();
  }

}
