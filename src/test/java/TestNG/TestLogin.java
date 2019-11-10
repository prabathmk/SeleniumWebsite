package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogin {
	
	
	static WebDriver ffdriver;
	
	@BeforeMethod
	public static void launch() {
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		ffdriver.get("http://localhost:3001/");
		ffdriver.manage().window().maximize();
		ffdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}
	
	@Test
	public static void testLogin() {
		
		
	ffdriver.findElement(By.id("login")).sendKeys("devops");
	ffdriver.findElement(By.id("password")).sendKeys("test");
	ffdriver.findElement(By.id("click")).click();
	
	}
	
	@AfterMethod
	public static void end()
	{
		ffdriver.close();
	}
	

}
