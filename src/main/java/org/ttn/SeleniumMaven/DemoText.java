package org.ttn.SeleniumMaven;

import java.awt.event.ActionEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoText {
	
	
		private static WebDriver driver;
		@BeforeMethod
		public void launch() throws InterruptedException{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhawana Pandey\\Downloads\\chromedriver_win32\\"+"chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
//		String e=driver.getTitle();
//		String a="hello";
//		Assert.assertEquals(a,e,"not valid ");
//		WebElement el=driver.findElement(By.xpath("//label[text()='Male"));
//		Actions ac=new Actions(driver);
//		ac.moveToElement(el).click().perform();
//		Thread.sleep(2000);
		
		
		
		
	}
	@Test
	public void demo1(){
//		WebElement heading=driver.findElement(By.xpath("//h5"));
//		String h=heading.getText();
//		Assert.assertEquals(h,"Student Registration Form","not valid");
//		WebElement number=driver.findElement(By.xpath("//input[@ id=\"userNumber\"]"));
//		WebElement heading=driver.findElement(By.xpath("//button[@id=\"tabButton\"]"));
		
//		number.click();
		driver.findElement(By.id("tabButton")).click();
//		String h2=driver.getWindowHandle();
//		System.out.println(h2);
		Set<String> h1=driver.getWindowHandles();
		System.out.println(h1);
		driver.switchTo().window(h1.stream().toList().get(1));
		String e=driver.findElement(By.id("sampleHeading")).getText();
		Assert.assertEquals(e,"This is a sample page"); 
		
		
		
		
	}
//	@Test
//	public void demo2(){
//		
//		
//	}
	@AfterMethod
	public void closebrowser(){
		driver.quit();
		
		
	}
	

	
}

