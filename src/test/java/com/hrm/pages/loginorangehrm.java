package com.hrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginorangehrm {
	WebDriver driver;
	
	public loginorangehrm(WebDriver driver)
	{
		this.driver = driver;
		
	}

	By un =  By.xpath("//input[@name = 'username']");
	By pwd =  By.xpath("//input[@name = 'password']");
	By submitbtn =  By.xpath("//button[@type = 'submit']");
	
	public DashboardPage login(String uname, String pword)
	{
		driver.findElement(un).sendKeys(uname);
		driver.findElement(pwd).sendKeys(pword);
		driver.findElement(submitbtn).click();
		return new DashboardPage(driver);
	}

}
