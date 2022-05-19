package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamAl {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
//		WebElement btnlogin = driver.findElement(By.xpath("//button[contains (text(), 'alert')]"));
//		btnlogin.click();
//		Thread.sleep(3000);
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		WebElement btntext = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		btntext.click();
		WebElement btnClick = driver.findElement(By.xpath("//button[contains (text(), 'confirm')]"));
		btnClick.click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		WebElement btnte = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		btnte.click();
		WebElement btncl = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		btncl.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.sendKeys("Greens");
		Thread.sleep(3000);
		alert1.accept();
		
		
//		WebElement btnClick = driver.findElement(By.xpath("//button[contains (text(), 'confirm')]"));
//		btnClick.click();
//		Alert alert = driver.switchTo().alert();
//		alert.accept();	
	}

}
