package org.practice1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinkSample {

	public static void main(String[] args) throws IOException, InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINNIE\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		ops.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("http://www.qspiders.com/");
		
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));	
		int size = allLinks.size();
		System.out.println("Total number of  links :"+size);
		
		
		int broken =0, notbroken =0;
		for (WebElement link : allLinks) {
			
			String href = link.getAttribute("href");
			String text = link.getText();
			
			System.out.println("URL is :"+href);
			System.out.println("Text is :"+ text);
			
			try {
				URL  url = new URL(href);
				URLConnection connection = url.openConnection();
				HttpURLConnection con = (HttpURLConnection)connection;
				int code = con.getResponseCode();			
//				System.out.println(code);
				if(code==200) {
					System.out.println("Link is not broken");
					notbroken++;
				}else {
					System.out.println("Link is broken1");
					String message = con.getResponseMessage();
					System.out.println(message);
					broken++;
				}
				}
			catch(Exception e) {
					System.out.println("Link is broken 2");
				broken++;
				}
			}
		System.out.println("===================================");
		System.out.println("Total number of  links :"+size);
			System.out.println("number of broken links is:" + broken);
			System.out.println("number of non broken links is "+notbroken);
			
			Thread.sleep(2000);
			
		driver.quit();
		 
		
		
		
}
}
