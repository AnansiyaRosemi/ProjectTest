package org.practice1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Checkboxx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINNIE\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		ops.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(ops);
		 driver.get("https://preview.colorlib.com/theme/bootstrap/checkbox-02/");
	 
		 List<WebElement> elements = driver.findElements(By.xpath("//input[@type='checkbox']"));
			 System.out.println(elements.size());
	
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
			
			for (WebElement x : elements) {
//				if(x.getAttribute("value").equals("BasketBall")\\(x.getAttribute("value").equals("BaseBall") {
						
				x.click();
	
//	}
			}
			
//		for (int i = 0; i < elements.size(); i++) {
//	if(elements.get(i).getAttribute("value").equals("BaseBall")\\elements.get(i).getAttribute("value").equals("BasketBall") {
//					elements.get(i).click();
//				}
//			}
	}
}
