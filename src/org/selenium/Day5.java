package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com");
		WebElement lnkcourse = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions actions = new Actions (driver);
		actions.moveToElement(lnkcourse).perform();
		WebElement lnkoracle = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		actions.moveToElement(lnkoracle).perform();
		WebElement Inksql = driver.findElement(By.xpath("//span[text()='SQL Certification']"));
		Inksql.click();	
	}	

}
