package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement s = driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[2]"));
		
		WebElement d = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(s, d).perform();
		driver.quit();
		
		
		
}
}
