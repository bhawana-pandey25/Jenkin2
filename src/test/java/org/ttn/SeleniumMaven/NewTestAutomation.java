package org.ttn.SeleniumMaven;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTestAutomation {
	private static WebDriver driver;
	@BeforeMethod
	public void launch() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhawana Pandey\\Downloads\\chromedriver_win32\\"+"chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	}
  @Test
  public void f () throws InterruptedException {
	  Thread.sleep(7000);
	  String loading=driver.findElement(By.xpath("//h5")).getText();
	  Assert.assertEquals(loading, "Login");
  }
  
  @Test
  public void login() throws 
   InterruptedException, AWTException {
	  Thread.sleep(5000);
	WebElement username= driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
	username.sendKeys("Admin");
	WebElement password= driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
	password.sendKeys("admin123");
	 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//a[@ class=\"oxd-main-menu-item\"]")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
	 Thread.sleep(50000);
	 Robot r=new Robot();
	 driver.findElement(By.xpath("(//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"])[1]")).click();
	 r.keyPress(KeyEvent.VK_DOWN);
	 Thread.sleep(5000);
	 r.keyPress(KeyEvent.VK_DOWN);
	 Thread.sleep(5000);
	 r.keyPress(KeyEvent.VK_ENTER);
	 Thread.sleep(50000);
	 driver.findElement(By.xpath("//input[@ placeholder=\"Type for hints...\"]")).sendKeys("a");
	 Thread.sleep(5000);
	 r.keyPress(KeyEvent.VK_DOWN);
	 Thread.sleep(5000);
	 r.keyPress(KeyEvent.VK_DOWN);
	 Thread.sleep(5000);
	 r.keyPress(KeyEvent.VK_ENTER);
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("(//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"])[2]")).click();
	 Thread.sleep(5000);
	 r.keyPress(KeyEvent.VK_DOWN);
	 Thread.sleep(5000);
	 r.keyPress(KeyEvent.VK_DOWN);
	 Thread.sleep(5000);
	 r.keyPress(KeyEvent.VK_ENTER);
	 Thread.sleep(5000);
	 List<WebElement> li=driver.findElements(By.xpath("//input[@class=\"oxd-input oxd-input--active\"]"));
	 li.get(1).sendKeys("Bhawana");
	 li.get(2).sendKeys("Bhawana@1234");
	 li.get(3).sendKeys("Bhawana@1234");
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("driver.findElement(By.xpath(\"//button[@class=\\\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\\\"]\")).click();")).click();
	 Thread.sleep(5000);
//	 r.keyPress(KeyEvent.VK_DOWN);
//	 Thread.sleep(5000);
//	 r.keyPress(KeyEvent.VK_ENTER);
//	 Thread.sleep(5000);
//	 r.keyPress(KeyEvent.VK_ENTER);
//	 Select dropdown = new Select(driver.findElement(By.xpath("//i[@ class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]")));
//	 dropdown.selectByVisibleText("Admin");
//	 Assert.assertEquals(username.getText(), "Admin");
//	 Assert.assertEquals(password.getText(), "admin123");
	
//	 String loginn=driver.findElement(By.xpath("//h6")).getText();
//	 Assert.assertEquals(loginn, "Dashboard");
	
////	 
//	
	 
	  
  }
//  @Test
//  public void admin() throws InterruptedException {
//	  Thread.sleep(5000);
//	 
//
//	  
//  }
  
  @AfterMethod
  public void closebrowser(){
		driver.close();
		
		
	}
}
