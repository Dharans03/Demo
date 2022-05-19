package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver a = new ChromeDriver();
		
		a.get("http://greenstech.in/selenium-course-content.html");
		
		String title = a.getTitle();
		System.out.println(title);
		
		String currentUrl = a.getCurrentUrl();
		System.out.println(currentUrl);
		
		a.manage().window().maximize();
		
		a.quit();
	}

}
