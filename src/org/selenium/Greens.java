package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
	
		
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("Greens");
		
		WebElement texpass = driver.findElement(By.id("pass"));
		texpass.sendKeys("56789");
		
		WebElement Login = driver.findElement(By.name("login"));
		Login.click();
		
		driver.manage().window().maximize();
		driver.quit();
	}

}
