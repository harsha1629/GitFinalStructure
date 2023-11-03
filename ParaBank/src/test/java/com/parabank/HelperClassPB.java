package com.parabank;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelperClassPB {
	private static WebDriver driver;

	private static HelperClassPB helperClassPB;

	public HelperClassPB() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}

	public void openPage(String url) {
		driver.get(url);
	}

	public static WebDriver getdriver() {
		return driver;

	}

	public void setDriver() {
		if (helperClassPB == null) {
			helperClassPB = new HelperClassPB();
		}
	}

	public void tearDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
		helperClassPB = null;
	}
}
