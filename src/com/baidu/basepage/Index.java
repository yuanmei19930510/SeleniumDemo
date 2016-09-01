package com.baidu.basepage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Index {
	
	public static WebDriver driver;
	private static Map<String,WebElement>map=new HashMap<String,WebElement>();

	public static void startURL(){
	System.setProperty("webdriver.chrome.driver", "G:\\BaiduYunDownload\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.baidu.com");
	try {
		Thread.sleep(5000);
		setElement();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public static void setElement(){
		map.put("nuomi",driver.findElement(By.linkText("糯米")));
		map.put("news",driver.findElement(By.linkText("新闻")));
		map.put("ha0123",driver.findElement(By.linkText("hao123")));
		map.put("map",driver.findElement(By.linkText("地图")));
		map.put("vedio",driver.findElement(By.linkText("视频")));
		map.put("tieba",driver.findElement(By.linkText("贴吧")));
		map.put("login",driver.findElement(By.linkText("登录")));
		map.put("setting",driver.findElement(By.linkText("设置")));
	}
	
	@SuppressWarnings("unchecked")
	public static WebElement getElement(String key){
		for(Map.Entry<String, WebElement> entry:map.entrySet())
		{
			if(entry.getKey().equals(key))
			{
				return entry.getValue();
			}			
		}		
		return null;
		
	}
	
	
}
