package com.hrm.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hrm.pages.AddEmployeePage;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.EmployeeListPage;
import com.hrm.pages.loginorangehrm;
import com.hrm.pages.pimPage;

public class AddEmployee {
	
	WebDriver driver;
	String path = "D:\\Imran\\IMRAN-PRACTISE\\OrangeHrm\\drivers\\chromedriver.exe";
	DashboardPage dp;
	pimPage pim;
	AddEmployeePage aep;
	EmployeeListPage elp;
	
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
	public void CreateEmp()
	{
		loginorangehrm lp = new loginorangehrm(driver);
		lp.login("Admin", "admin123");
		dp.pim();
		pim.addemp();
		aep.createEmployee("Mark", "wood", "England", "90147");
		
	}
	
	
	

}
