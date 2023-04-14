package org.practice1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinks {
	public static void main(String[] args) throws IOException  {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINNIE\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe");
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--remote-allow-origins=*");
			ops.addArguments("--start-maximized");
			WebDriver driver = new ChromeDriver(ops);
			driver.get("http://www.qspiders.com/");
			
			// URL is a class present in java.net package
			
			URL url = new URL("http://www.qspiders.com/");
			
			URLConnection connection = url.openConnection();
			HttpURLConnection con = (HttpURLConnection)connection;       //typecasting
			
			int code = con.getResponseCode(); //if code=200 link is not broken
			System.out.println(code);
			
			String msg = con.getResponseMessage(); //if message is okay, link is not broken
			System.out.println(msg);
			
	}

}
