package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1 {
	
	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement psstbx;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lggbtn;
	
	public Login1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void setLogin (String un,String pw)
	{
		untbx.sendKeys(un);
		psstbx.sendKeys(pw);
		lggbtn.click();
	}
	

}
