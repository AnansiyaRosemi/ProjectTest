package org.practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JSHighlighting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINNIE\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		ops.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//SCROLLING USING PIXEL:
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("window.scrollBy(0,-500)");
//		
		//SCROLLING UPTO 50PIXEL FOR 10 TIMES:
		
		for (int i = 0; i < 10; i++) {
			js.executeScript("window.scrollBy(0,50)");
		}
		Thread.sleep(3000);
		for (int i = 0; i < 10; i++) {
			js.executeScript("window.scrollBy(0,-50)");
		}
		
		//SCROLL UPTO SPECIFIED ELEMENT:
		
		WebElement element = driver.findElement(By.xpath("//h2[text()='Electronics devices for home office']"));
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		
		
		//USING PAGE DOWN:
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys(Keys.PAGE_DOWN);

		
		//HIGHLIGHT WEBELEMENT  IN YELLOW COLOR AND RED BOX:
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow;border:solid 2px red');", search);
		search.sendKeys("mobile");
	}
}
