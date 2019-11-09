package TestNG;
import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {
		
	static WebDriver ffdriver;
			
	@Test
	public static void testCase() {
				
	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	ffdriver.get("http://localhost:3001/");
	ffdriver.manage().window().maximize();
	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	FirefoxDriver ffdriver = new FirefoxDriver();
	ffdriver.get("https://www.google.com");
	ffdriver.manage().window().maximize();
	String x = ffdriver.getCurrentUrl();
	System.out.println(x);

	
	}

}

