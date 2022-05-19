package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamTable {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
//		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
//		driver.manage().window().maximize();
//		List<WebElement> totalRows = driver.findElements(By.tagName("tr"));
//		for (WebElement eachrow : totalRows) {
//			String text = eachrow.getText();
//			System.out.println(text);
//			
//		}
//		System.out.println("+++++++++++++++");
//		
//		List<WebElement> totalData = driver.findElements(By.tagName("td"));
//		for (WebElement eachData : totalData) {
//			String Data = eachData.getText();
//			System.out.println(Data);
//			
//		}
//		
//		WebElement findElement = driver.findElement(By.xpath("//tr[1]/td[1]"));
//		
//		System.out.println(findElement.getText());
	}

}
