package org.tasks.life.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Utilities {
	public static WebDriver driver;

	public static void browserOpen(String browserName, String desc, String driverLocation) {
		
		switch (browserName) {
		case "Chrome":
			System.setProperty(desc, driverLocation);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "Firefox":
			System.setProperty(desc, driverLocation);
			driver = new FirefoxDriver();
			break;

		case "IE":
			System.setProperty(desc, driverLocation);
			driver = new InternetExplorerDriver();
			break;

		}
		
		

	}

	public static void launchApp(String url) {
		driver.get(url);
	}

	public static void browserClose() {
		driver.quit();
	}

}
