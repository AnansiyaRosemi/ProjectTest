package org.practice1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckboxUsingJS {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINNIE\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe");
	ChromeOptions ops = new ChromeOptions();
	ops.addArguments("--remote-allow-origins=*");
	ops.addArguments("--start-maximized");
	WebDriver driver = new ChromeDriver(ops);
	
	driver.get("https://formstone.it/components/checkbox/");
	
	
	 List<WebElement> elements = driver.findElements(By.xpath("//input[@type='checkbox']"));
	 System.out.println(elements.size());
	 
	 WebElement twobtn = driver.findElement(By.id("checkbox-2"));
	 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click", twobtn);


	 WebElement four = driver.findElement(By.id("checkbox-4"));
	js.executeScript("arguments[0].click()", four);
	

	 

}
}

