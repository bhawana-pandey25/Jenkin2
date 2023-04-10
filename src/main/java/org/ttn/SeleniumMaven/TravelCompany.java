package org.ttn.SeleniumMaven;

import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TravelCompany {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhawana Pandey\\Downloads\\chromedriver_win32\\"+"chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.path2usa.com/travel-companion/");
		WebElement ele=driver.findElement(By.xpath("//input[@id='form-field-travel_from']"));
//		ele.sendKeys(Keys.DOWN);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"form-field-travel_from\"]")).sendKeys("delhi");
        driver.findElement(By.xpath("//*[@id=\"form-field-travel_to\"]")).sendKeys("mumbai");
        driver.findElement(By.xpath("//*[@id=\"form-field-travel_comp_date\"]")).click();
        driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div[2]/div/span[33]")).click();
        WebElement week = driver.findElement(By.xpath("//*[@id=\"form-field-travel_comp_date_between\"]"));
        Select s = new Select(week);
        s.selectByVisibleText("+ - 2 Weeks");
        WebElement airline  = driver.findElement(By.xpath("//*[@id=\"form-field-travel_comp_airline\"]"));
        s=new Select(airline);
        s.selectByIndex(3);
        WebElement Language = driver.findElement(By.xpath("//*[@id=\"form-field-travel_comp_language\"]"));
        s=new Select(Language);
        s.selectByVisibleText("Hindi");
        driver.findElement(By.xpath("//*[@id=\"travel_comp_form\"]/div/div[12]/button")).click();
        Thread.sleep(3000);
		File SFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SFile, new File(".//screenshot/.png"));
	}

}
