package org.ttn.SeleniumMaven;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhawana Pandey\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		ChromeDriver c = new ChromeDriver();
//		c.get("http://www.google.com");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait w=new WebDriverWait(driver, 20);
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
//		driver.findElement(By.xpath("//input[@ id=\"firstName\"]")).sendKeys("bhawana");
		WebElement fname=driver.findElement(By.xpath("//input[@ id=\"firstName\"]"));
		Set<String> allhandles=driver.getWindowHandles();
		w.until(ExpectedConditions.visibilityOf(fname));
		fname.sendKeys("bhawana");
		driver.findElement(By.xpath("//input[@ id=\"lastName\"]")).sendKeys("pandey");
		driver.findElement(By.xpath("//input[@ placeholder=\"name@example.com\"]")).sendKeys("pandeybhawana56@gmail.com");
		driver.findElement(By.xpath("//input[@ placeholder=\"Mobile Number\"]")).sendKeys("9876785968");
		driver.findElement(By.xpath("//textarea[@ placeholder=\"Current Address\"]")).sendKeys("Uttarakhand");
		driver.findElement(By.xpath("//label[@ for=\"gender-radio-2\"]")).click();
		driver.findElement(By.xpath("//label[@ for=\"hobbies-checkbox-1\"]")).click();
		Wait wait=new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(5,TimeUnit.SECONDS).ignoring(ElementNotInteractableException.class);
		driver.switchTo().window(allhandles.stream().toList().get(1));
//		driver.findElement(By.cssSelector("input#first-name[type=\"text\"]")).sendKeys("bhawana");
//		System.out.println(driver.getTitle());
//		driver.findElement(By.id("first-name")).sendKeys("bhawana");
//		driver.findElement(By.className("first-name")).sendKeys("bhawana");
//		Thread.sleep(5000);
//		driver.close();
		

	}

}