package com.actitime.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.actitime.generic.Baseclass1;
import com.actitime.pom.Entertimetrack1;
import com.actitime.pom.Tasklist1;

public class createcustomer1 extends Baseclass1 {

	@Test
	public void createCustomer()
	{
		Entertimetrack1 ettt=new Entertimetrack1(driver);
		ettt.getTaskbt().click();

		Tasklist1 tsk = new Tasklist1(driver);
		tsk.getAddnewbtn().click();
		tsk.getNewcustomer().click();
		tsk.getEntercustomername().sendKeys("ram88");
		tsk.getCreatecustomer().click();




	}

}  




