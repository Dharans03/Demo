package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Dharanya");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("12345678");
		
		WebElement Login = driver.findElement(By.name("login"));
		Login.click();
		
	}

}
