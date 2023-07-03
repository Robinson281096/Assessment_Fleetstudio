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

public class TC003_InvalidMin_password {

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91830\\eclipse-workspace\\FleetStudio\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.manage().window().maximize();
		
		
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("input-firstname")).sendKeys("Robinson");
	driver.findElement(By.id("input-lastname")).sendKeys("K");
	driver.findElement(By.id("input-email")).sendKeys("k.robinson281096@gmail.com");
	driver.findElement(By.id("input-telephone")).sendKeys("123456789");
	driver.findElement(By.id("input-password")).sendKeys("Rob");
	driver.findElement(By.id("input-confirm")).sendKeys("Rob");
	driver.findElement(By.name("agree")).click();
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	WebElement m = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[2]/div[1]/div/div"));
	String act = m.getText();
	System.out.println("Error message is "+ act);


	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", m);

	TakesScreenshot d=(TakesScreenshot) driver;
	File src = d.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\91830\\eclipse-workspace\\FleetStudio\\Screenshots\\TC003.png");
	FileUtils.copyFile(src, des);



		
	}
	}
