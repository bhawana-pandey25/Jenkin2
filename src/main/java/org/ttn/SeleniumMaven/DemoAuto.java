package org.ttn.SeleniumMaven;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAuto {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhawana Pandey\\Downloads\\chromedriver_win32\\"+"chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("bhawana");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("pandey");
		driver.findElement(By.xpath("//textarea[@ ng-model=\"Adress\"]")).sendKeys("haldwani","uttarakhand");
		driver.findElement(By.xpath("//input[ @ ng-model=\"EmailAdress\"]")).sendKeys("bhawana.pandey@tothenew.com");
		driver.findElement(By.xpath("//input[ @ ng-model=\"Phone\"]")).sendKeys("9876789789");
		driver.findElement(By.xpath("//input[@value=\"FeMale\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"checkbox2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"English\"]")).click();
		WebElement skill=driver.findElement(By.xpath("//select[@ ng-model=\"Skill\"]"));
		Select s=new Select(skill);
		s.selectByVisibleText("java");
		driver.findElement(By.xpath("//select[@id=\"countries\"]")).click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		WebElement country=driver.findElement(By.xpath("//span[@role=\"combox\"]"));
		country.click();
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		WebElement year=driver.findElement(By.xpath("//select[@ id=\"yearbox\"]"));
		year.click();
		year.sendKeys("2");
		Robot r2= new Robot();
		r2.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		WebElement month=driver.findElement(By.xpath("//select[@ placeholder=\"month\"]"));
		year.click();
		year.sendKeys("a");
		Robot r3= new Robot();
		r3.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		r3.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		r3.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		r3.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		r3.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		WebElement day=driver.findElement(By.xpath("//select[@ id=\"daybox\"]"));
		year.click();
		year.sendKeys("4");
		Robot r4= new Robot();
		r4.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@ id=\"firstpassword\"]")).sendKeys("Lalisa@97");
		driver.findElement(By.xpath("//input[@ id=\"secondpassword\"]")).sendKeys("Lalisa@97");
		driver.findElement(By.xpath("//button[@id=\"submitbtn\"]")).click();
		Thread.sleep(0);
	}

}