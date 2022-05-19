package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SamDds {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement dndSkills = driver.findElement(By.id("Skills"));
		Select select = new Select(dndSkills);
		select.selectByIndex(10);
		Thread.sleep(2000);
		select.selectByValue("Configuration");
		Thread.sleep(2000);
		select.selectByVisibleText("ConfigurationConfiguration");
		
		List<WebElement> options = select.getOptions();
		int size = options.size();
		System.out.println(size);
		
		for (int i = 0; i < options.size(); i++) {
			
			WebElement eachoption = options.get(i);
			String data = eachoption.getText();
			System.out.println(data);
		
			
			
		}
		
		
		}
	

}
