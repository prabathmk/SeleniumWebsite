package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestLogin {
	
	
	static WebDriver ffdriver;
	
	@Test
	public static void testLogin() {
		
	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	ffdriver.get("http://localhost:3001/");
	ffdriver.manage().window().maximize();
	
	Assert.assertEquals( ffdriver.findElement(By.xpath("/html/body/form/div/div/div/div[1]/div[2]")).getText(),"devops");

	Assert.assertEquals( ffdriver.findElement(By.xpath("/html/body/form/div/div/div/div[1]/div[4]")).getText(),"test");
	
	}
	
	@AfterMethod
	public static void end()
	{
		ffdriver.quit();
	}
	

}
