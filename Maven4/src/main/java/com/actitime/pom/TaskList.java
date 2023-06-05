package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskList {
@FindBy(xpath ="//div[text()='Add New']")
private WebElement addNewBtn;

@FindBy(xpath ="//div[text()='+ New Customer']")
private WebElement newCustomerBtn;

@FindBy(xpath = "//input[@placeholder='Enter Customer Name' and @class]")
private WebElement enterCustomerNametbx;


@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
private WebElement enterCustomerDescriptiontbx;

@FindBy(xpath = "//div[text()='Create Customer']")
private WebElement createCustomerbtn;


public TaskList(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


public WebElement getAddNewBtn() {
	return addNewBtn;
}


public WebElement getNewCustomerBtn() {
	return newCustomerBtn;
}


public WebElement getEnterCustomerNametbx() {
	return enterCustomerNametbx;
}


public WebElement getEnterCustomerDescriptiontbx() {
	return enterCustomerDescriptiontbx;
}


public WebElement getCreateCustomerbtn() {
	return createCustomerbtn;
}



}
