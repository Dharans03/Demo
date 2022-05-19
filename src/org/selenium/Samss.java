package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samss {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
       TakesScreenshot screenshot = (TakesScreenshot) driver;
       File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
       File dest = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\ss\\FB.png");
       FileUtils.copyFile(screenshotAs, dest);
       
       WebElement findElement = driver.findElement(By.name("login"));
       File screenshotAs2 = findElement.getScreenshotAs(OutputType.FILE);
       File dest2 = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\ss\\FB1.png");
       FileUtils.copyFile(screenshotAs2, dest2);
       
       driver.quit();
       
       
       
       
       
       
        
        
        
		
	}

}
