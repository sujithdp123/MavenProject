package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Entertimetrack1 {
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	@FindBy(id="container_tasks")
	private WebElement taskbt;
	
	public Entertimetrack1 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getTaskbt() {
		return taskbt;
	}
	
	
	

}
