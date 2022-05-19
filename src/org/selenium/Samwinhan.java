package org.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samwinhan {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtsearch.sendKeys("iphone", Keys.ENTER);
		WebElement inkphone = driver.findElement(By.xpath("//span [text()='Apple iPhone XR (128GB) - Coral']"));
		inkphone.click();
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		Set<String> Allwindows = driver.getWindowHandles();
		System.out.println(Allwindows);
		for (String eachwindows : Allwindows) {
			driver.switchTo().window(eachwindows);		
		}
		WebElement btncart = driver.findElement(By.id("add-to-cart-button"));
		btncart.click();
	}

}
