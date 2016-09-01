package com.baidu.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.baidu.basepage.Index;

public class MyAlert {

	public static void startAlert(WebDriver driver){
		String js="alert(\"抱歉！未找到操作元素！\")";
		((JavascriptExecutor)driver).executeScript(js);
		try {
			Thread.sleep(2000);
			Alert a=Index.driver.switchTo().alert();
			a.accept();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
