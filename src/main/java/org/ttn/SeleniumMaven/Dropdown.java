package org.ttn.SeleniumMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhawana Pandey\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait w=new WebDriverWait(driver, 20);
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
//		driver.findElement(By.xpath("//select[@name=\"country\"]"));
//		Select s=new Select(address);
//		s.selectByVisibleText("INDIA");
//		s.selectByIndex(2);
		WebElement d=driver.findElement(By.xpath("//button[@id=\"alertButton\"]"));
		d.click();
		
		Alert a=driver.switchTo().alert();
		a.accept();
//		a.dismiss();
//		a.sendKeys("haha");
		
		
		

	}

}

