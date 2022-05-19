package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SamRobo {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Robot rob = new Robot();
		
		rob.keyPress(KeyEvent.VK_SHIFT);
		
		rob.keyPress(KeyEvent.VK_G);
		rob.keyRelease(KeyEvent.VK_G);
		rob.keyPress(KeyEvent.VK_N);
		rob.keyRelease(KeyEvent.VK_N);
		rob.keyPress(KeyEvent.VK_S);
		rob.keyRelease(KeyEvent.VK_S);
		
		rob.keyRelease(KeyEvent.VK_SHIFT);
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_A);
		rob.keyRelease(KeyEvent.VK_A);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_C);
		rob.keyRelease(KeyEvent.VK_C);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		
		
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
		
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
//		Actions action = new Actions(driver);
//		WebElement inkGmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
//		action.contextClick(inkGmail).perform();
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		r.keyPress(KeyEvent.VK_SHIFT);
//		r.keyPress(KeyEvent.VK_G);
//		r.keyRelease(KeyEvent.VK_G);
//		r.keyPress(KeyEvent.VK_R);
//		r.keyRelease(KeyEvent.VK_R);
//		r.keyPress(KeyEvent.VK_E);
//		r.keyRelease(KeyEvent.VK_E);
//		r.keyPress(KeyEvent.VK_E);
//		r.keyRelease(KeyEvent.VK_E);
//		r.keyPress(KeyEvent.VK_N);
//		r.keyRelease(KeyEvent.VK_N);
//		r.keyPress(KeyEvent.VK_S);
//		r.keyRelease(KeyEvent.VK_S);
//		r.keyRelease(KeyEvent.VK_SHIFT);
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_A);
//		r.keyRelease(KeyEvent.VK_A);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_C);
//		r.keyRelease(KeyEvent.VK_C);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);
//		r.keyRelease(KeyEvent.VK_V);
//		r.keyRelease(KeyEvent.VK_CONTROL);	
		
		
		
		
		
		
		
		
	}

}
