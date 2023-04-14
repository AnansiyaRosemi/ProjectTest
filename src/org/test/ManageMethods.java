package org.test;
//
//import java.awt.Dimension;
//import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.Point;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ManageMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINNIE\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		 driver.get("https://www.facebook.com/");
		 
		 //delete all cookies: 
		 driver.manage().deleteAllCookies();
		 
		 //setSize:
		 
		Dimension  d = new Dimension(500,500);
		 driver.manage().window().setSize(d);
		 Thread.sleep(2000);
		 
		 //setPosition:
		 
		 Point p = new Point(250,250);
		 driver.manage().window().setPosition(p);
		 
		 Thread.sleep(1000);
		 
			//maximize
			driver.manage().window().maximize();
	}
	

}
