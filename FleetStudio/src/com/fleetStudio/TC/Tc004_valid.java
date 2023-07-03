package com.fleetStudio.TC;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc004_valid{

public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91830\\eclipse-workspace\\FleetStudio\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.manage().window().maximize();
		
		
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("input-firstname")).sendKeys("Robinson");
	driver.findElement(By.id("input-lastname")).sendKeys("K");
	driver.findElement(By.id("input-email")).sendKeys("k.robinson1123s81096@gmail.com");
	driver.findElement(By.id("input-telephone")).sendKeys("123456789");
	driver.findElement(By.id("input-password")).sendKeys("12345");
	driver.findElement(By.id("input-confirm")).sendKeys("12345");
	driver.findElement(By.name("agree")).click();
	driver.findElement(By.xpath("//input[@type='submit']")).click();


	TakesScreenshot d=(TakesScreenshot) driver;
	File src = d.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\91830\\eclipse-workspace\\FleetStudio\\Screenshots\\TC004.png");
	FileUtils.copyFile(src, des);



		
	}
	}

