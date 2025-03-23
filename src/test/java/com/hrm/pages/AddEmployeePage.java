package com.hrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddEmployeePage {
	
	WebDriver driver;
	
	public AddEmployeePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By fname=By.cssSelector("input[name='firstName']");
	By mname=By.cssSelector("input[name='middleName']");
	By lname=By.cssSelector("input[name='lastName']");
	By id=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	
	By checkbox=By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']");
	By uname=By.xpath("(//input[@autocomplete='off'])[1]");
	By pswd=By.xpath("(//input[@autocomplete='off'])[2]");
	By confirmpswd=By.xpath("(//input[@autocomplete='off'])[3]");
	By save=By.xpath("//button[@type='submit']");
	
	public EmployeeListPage createEmployee(String frname, String miname, String laname, String eid)
	{
		driver.findElement(fname).sendKeys(frname);
		driver.findElement(mname).sendKeys(miname);
		driver.findElement(lname).sendKeys(laname);
		driver.findElement(id).clear();
		driver.findElement(id).sendKeys(eid);
		driver.findElement(save).click();
		return new EmployeeListPage(driver);
		
	}
	
	public void createEmpWithLogin(String frname, String miname, String laname, String eid)
	{
		driver.findElement(fname).sendKeys(frname);
		driver.findElement(mname).sendKeys(miname);
		driver.findElement(lname).sendKeys(laname);
		driver.findElement(id).clear();
		driver.findElement(id).sendKeys(eid);
		driver.findElement(save).click();
		
	}

}
