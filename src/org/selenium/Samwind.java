package org.selenium;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samwind {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtsearch.sendKeys("iphone", Keys.ENTER);
		WebElement inkphone = driver.findElement(By.xpath("//span [text()='Apple iPhone XR (128GB) - Coral']"));
		inkphone.click();
		String windowHandle = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
//		ArrayList windows = new ArrayList();
//		windows.addAll(allWindows);
		System.out.println(allWindows);
		
		
		
		//List<String> windows = new ArrrayList();
		
		
		
		
	}

}
