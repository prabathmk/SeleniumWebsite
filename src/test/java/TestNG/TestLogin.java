package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogin {
	
	
	static WebDriver ffdriver;
	
	@Test
	public static void testLogin() {
		
	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	FirefoxDriver ffdriver = new FirefoxDriver();
	ffdriver.get("http://localhost:3001/");
	ffdriver.manage().window().maximize();
	ffdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
	ffdriver.findElement(By.xpath("/html/body/form/div/div/div/div[1]/div[2]")).sendKeys("devops");
	ffdriver.findElement(By.xpath("/html/body/form/div/div/div/div[1]/div[4]")).sendKeys("test");
	ffdriver.findElement(By.xpath("/html/body/form/div/div/div/div[1]/div[6]")).click();
	
	}
	
	@AfterMethod
	public static void end()
	{
		ffdriver.close();
	}
	

}
