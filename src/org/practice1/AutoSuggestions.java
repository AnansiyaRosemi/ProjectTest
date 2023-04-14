package org.practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINNIE\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		ops.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://www.google.com/");
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("selenium");
		
		Thread.sleep(2000);
		//to handle auto suggestions:
		String xp = "//span[contains(text(),'selenium')]";
		List<WebElement> allSuggestions = driver.findElements(By.xpath(xp));
		int count = allSuggestions.size();
		System.out.println(count);
		
		for (int i = 0; i < allSuggestions.size(); i++) {
			WebElement suggestion = allSuggestions.get(i);
//			String text = suggestion.getText();
//			System.out.println(text);
			
			//last suggestion
			allSuggestions.get(count-1).click();
		}
	
	
	}
}
