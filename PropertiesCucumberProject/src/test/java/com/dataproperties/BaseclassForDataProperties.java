package com.dataproperties;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseclassForDataProperties {
	private static WebDriver driver;
	
	private static BaseclassForDataProperties baseclassForDataProperties;
	
	BaseclassForDataProperties(){
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	
	public void openingPage(String url) {
		driver.get(url);
	}
	
	public static WebDriver getdriver() {
		return driver;
		
	}
	
	public static void setUpDriver() {
		if(baseclassForDataProperties==null) {
			baseclassForDataProperties =new BaseclassForDataProperties();
		}
	}
	
	public static void closeDriver() {
		if(driver!=null) {
			driver.quit();
			driver.close();
		}
		baseclassForDataProperties =null;
	}
}
