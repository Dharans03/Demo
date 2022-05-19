package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("Greens");
		driver.navigate().forward();
//		WebElement inkforgot = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
//		inkforgot.click();
//		WebElement email = driver.findElement(By.id("identify_email"));
//		email.sendKeys("123456789");
//		driver.navigate().back();
//		String attribute = txtuser.getAttribute("Value");
//		System.out.println(attribute);
//		driver.navigate().forward();
		
		
	}

}
