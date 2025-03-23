package com.hrm.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hrm.pages.DashboardPage;
import com.hrm.pages.loginorangehrm;

public class VerifyDashboardElements {
	
	WebDriver driver;
	String path = "D:\\Imran\\IMRAN-PRACTISE\\OrangeHrm\\drivers\\chromedriver.exe";

	
	@BeforeTest
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void login()
	{
	
		System.out.println(driver);
		loginorangehrm loginorangehrm = new loginorangehrm(driver);
		loginorangehrm.login("Admin", "admin123");
		DashboardPage dbp = new DashboardPage(driver);
		String taw = dbp.timework();
		Assert.assertEquals("Time at Work", taw);
		
	}


}
