package com.hrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.hrm.test.AddEmployee;

public class pimPage {
	
	WebDriver driver;
	
	public pimPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By Addemp = By.xpath("//button[text()= 'Add ']");
	
	public AddEmployeePage addemp()
	{
		driver.findElement(Addemp).click();
		return new AddEmployeePage(driver);
	}

}
