package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dd2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		WebElement dndcars = driver.findElement(By.id("cars"));
		Select select = new Select(dndcars);
		List<WebElement> options = select.getOptions();
//		for (int i=1; i < options.size(); i=i+2) {
//			select.selectByIndex(i);
//			}
//		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
//		
//		for (WebElement eachselected : allSelectedOptions) {
//			System.out.println(eachselected.getText());
//			
//		}
		
//		WebElement firstSelectedOption = select.getFirstSelectedOption();
//		System.out.println(firstSelectedOption.getText());
		for (WebElement eachoptions : options) {
			String data = eachoptions.getText();
			select.selectByVisibleText(data);
			
		}
		
//		select.deselectByIndex(1);
//		select.deselectAll();
		select.deselectByVisibleText("Saab");

			
			
		
	}}

