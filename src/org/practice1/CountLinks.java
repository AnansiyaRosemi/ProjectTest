package org.practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CountLinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINNIE\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		 driver.get("https://www.google.com/");
	
		 List<WebElement> elements = driver.findElements(By.tagName("a"));
		 
		 //to count the number of links:
		 int size = elements.size();
		 System.out.println(size);
		 
		 //to print the number of links
		 
		 for (WebElement x : elements) {
			System.out.println(x.getAttribute("href"));
		}
	}
	
}
