package org.test;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

//method over riding//
public class LaunchDifferentBrowsers {
public static void main(String[] args) throws InterruptedException {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter browser name");
	String browserName = sc.nextLine();

	
	WebDriver driver = null;
	
	if(browserName.equals("Chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINNIE\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe");
	ChromeOptions ops = new ChromeOptions();
	ops.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(ops);
	 driver.get("https://www.facebook.com/");
	
}else if(browserName.equals("Firefox")) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\MINNIE\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe" );
	 driver = new FirefoxDriver();
	 driver.get("https://www.facebook.com/");
}else {
	System.out.println("invalid browser");
}

	Thread.sleep(2000);
	driver.close();
}
}
