package org.practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElementMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINNIE\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		 driver.get("https://www.facebook.com/");
		 
		 WebElement username = driver.findElement(By.id("email"));
		 
		 //getSize()
		 Dimension d = username.getSize();
		 int h = d.getHeight();
		 int w = d.getWidth();
		 
		 System.out.println("height of element is :"+h);
		 System.out.println("width of element is :"+w);
		 
		 //getLocation()
		 Point p = username.getLocation();
		int x = p.getX(); 
		 int y = p.getY();
		 
		 System.out.println("x axis of element is :"+x);
		 System.out.println("y axis of element is :"+y);
		 
		 //getTagName()
		 String tagName = username.getTagName();
		 System.out.println(tagName);
		 
		 //getCSSValue()
		 String color = username.getCssValue("color");
		 System.out.println(color);
		 
		 String backgrd = username.getCssValue("background");
		 System.out.println(backgrd);
		 
		 String fontSize= username.getCssValue("font-size");
		 System.out.println(fontSize);
		 
		 String fontfam = username.getCssValue("font-family");
		 System.out.println(fontfam);
		 
		 String fontweight = username.getCssValue("font-weight");
		 System.out.println(fontweight);
	}
}
