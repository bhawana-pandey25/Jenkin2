package org.ttn.SeleniumMaven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
public class TtnServicesCheck {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhawana Pandey\\Downloads\\chromedriver_win32\\"+"chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tothenew.com/");
		WebElement ele=driver.findElement(By.xpath("(//*[@id=\"h-Services\"])[2]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(ele).perform();
		String li=driver.findElement(By.xpath("(//*[@id=\"menu\"]/ul/li[2]/ul)[2]")).getText();
		System.out.println(li);
		Thread.sleep(2000);
		Assert.assertTrue(li.contains("Digital Engineering"));
		Assert.assertTrue(li.contains("Cloud & DevOps"));
		Assert.assertTrue(li.contains("OTT Solutions & Services"));
		Assert.assertTrue(li.contains("Data & Analytics"));
		Assert.assertTrue(li.contains("CX, Content & Commerce"));
		Assert.assertTrue(li.contains("Digital Marketing"));
		}

}
