package rahulshettyacadamy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day1 {
	@Test
	public void Login() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://softwares//chromedriver.exe"); 
		
			 WebDriver driver=new ChromeDriver();
			 
			 
			 driver.get("https://login.salesforce.com");
			 driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("test");
			 
			// driver.findElement(By.xpath("//*[@id=\"username\"]")).clear();
			// Thread.sleep(15000);
			// driver.navigate().back();
	}

	@Test()
	public void HomeLoan1()
	{
		System.out.println("HomeLoan1");

	}
	@Test()
	public void HomeLoan2()
	{
		System.out.println("HomeLoan2");

	}

}
