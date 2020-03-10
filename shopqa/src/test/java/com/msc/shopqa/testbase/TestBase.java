package com.msc.shopqa.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public WebDriver driver;
	
	
	public void setUp() {
		
		
		driver = new ChromeDriver();
		
	}
	
	public void tearDown() {
		
		driver.quit();
		
	}

}
