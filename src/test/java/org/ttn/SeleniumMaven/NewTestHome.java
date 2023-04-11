package org.ttn.SeleniumMaven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class NewTestHome {
 WebDriver driver;
 @Test
 public void checklogo() throws InterruptedException {


	 
WebElement logo= driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
Assert.assertTrue(logo.isDisplayed());
Thread.sleep(3000);
}
@AfterTest
public void close() {
  driver.close();
 }
    
}
