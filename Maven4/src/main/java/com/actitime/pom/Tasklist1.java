package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tasklist1 {
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewbtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newcustomer;
	
	@FindBy(xpath="//input [@placeholder='Enter Customer Name' and @class]")
	private WebElement entercustomername;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createcustomer;
	
	public Tasklist1 (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewcustomer() {
		return newcustomer;
	}

	public WebElement getEntercustomername() {
		return entercustomername;
	}

	public WebElement getCreatecustomer() {
		return createcustomer;
	}}
	
