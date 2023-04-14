package org.practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINNIE\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		ops.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		WebElement table = driver.findElement(By.xpath("//table[@border='1']"));
		List<WebElement> trows = table.findElements(By.tagName("tr"));
		
		for (int i = 0; i < trows.size(); i++) {
			WebElement rows = trows.get(i);
		List<WebElement> tdata = rows.findElements(By.tagName("td"));
		for (int j = 0; j < tdata.size(); j++) {
		WebElement data = tdata.get(j);	
		String text = data.getText();
		if(text.equals("Shanghai")) {
		System.out.println(text);
		System.out.println(i);
		System.out.println(j);
		}
		}
		}
		
	}
}
