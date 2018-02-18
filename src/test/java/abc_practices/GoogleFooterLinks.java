package abc_practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GoogleFooterLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:/Users/Saiful/Utilities/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Privacy")).click();
		Thread.sleep(2000);
		if (driver.getPageSource().contains("Privacy"));
		//Thread.sleep(2000);
		
		//System.out.println("The test Pass" );
		
		//else
			//System.out.println("The test failed");
		//Assert.assertEquals(true, driver.getPageSource().contains("Privacy"));
		//Thread.sleep(5000);
		//System.out.println("The test passed");
		Assert.assertEquals(false, driver.getPageSource().contains("Privacyyy"));
		Assert.assertEquals(0, 2-2);
		
		Thread.sleep(3000);
		
		//System.out.println("The test failed");
		driver.close();
		

	}

}
