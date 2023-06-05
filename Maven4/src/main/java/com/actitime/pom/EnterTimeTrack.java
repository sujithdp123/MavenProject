package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrack {
@FindBy(id="logoutLink")
private WebElement logoutbtn;


@FindBy(id="container_tasks")
private WebElement taskbtn;

public EnterTimeTrack(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getLogoutbtn() {
	return logoutbtn;
}

public WebElement getTaskbtn() {
	return taskbtn;
}
}
