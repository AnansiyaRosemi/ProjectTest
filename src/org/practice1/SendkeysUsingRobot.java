package org.practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SendkeysUsingRobot {


		public static void main(String[] args) throws InterruptedException 
		{
		//open the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINNIE\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://adactin.com/HotelApp/index.php");
		driver.manage().window().maximize();
		WebElement x = driver.findElement(By.id("username"));
		x.sendKeys("Anansiya");
		WebElement x1 = driver.findElement(By.name("password"));
	x.sendKeys(Keys.CONTROL, "AC");
	x1.sendKeys(Keys.CONTROL,"V");
		}
}
