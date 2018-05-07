package org.tasks.life.resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class LifeTimePages extends Utilities {
	static String text;

	public static void navigateToBasketBall() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
			driver.findElement(By.xpath("//*[contains(text(),'×')]")).click();
		} catch (Exception e) {
			System.out.println("exception catched");
		}
		driver.findElement(By.linkText("Sports")).click();
		driver.findElement(By.linkText("Basketball")).click();

	}

	public static String verifyText() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		text = driver.findElement(By.xpath("//div[10]/div/div/div/h4")).getText();
		System.out.println("The text available in the webpage : "+text);
		return text;
	}
}