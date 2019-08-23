package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinWebSite{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\indira.saravanan\\eclipse-workspace\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get("https://chromedriver.storage.googleapis.com/index.html?path=76.0.3809.126/");
		driver.get("https://adactin.com/HotelApp/");
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("indira");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("indira123");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.linkText("New User Register Here")).click();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("indira");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("indira123");
		driver.findElement(By.id("re_password")).click();
		driver.findElement(By.id("re_password")).sendKeys("indira123");
		driver.findElement(By.id("full_name")).click();
		driver.findElement(By.id("full_name")).sendKeys("IndiraSaravanan");
		driver.findElement(By.id("email_add")).click();
		driver.findElement(By.id("email_add")).sendKeys("indhiraviji3@gmail.com");
		driver.findElement(By.id("captcha-form")).click();
		driver.findElement(By.id("captcha-form")).sendKeys("mudde");
		driver.findElement(By.id("tnc_box")).click();
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.linkText("Click here to login")).click();
		driver.findElement(By.cssSelector("tr:nth-child(2) img")).click();
	}
}
