package com.hrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	WebDriver driver;
	
	public DashboardPage(WebDriver driver)
	{
		this.driver = driver;
	}

			By timeatWork = By.xpath("//p[text() = 'Time at Work']");
			By myactions = By.xpath("//p[text() = 'My Actions']");
			By pim =By.xpath("//span[text() = 'PIM']");
			
			public String timework()
			{
				String time_work = driver.findElement(timeatWork).getText();
				return time_work;
			}
			
			public pimPage pim()
			{
				driver.findElement(pim).click();
				return new pimPage(driver);
				
			}
}
