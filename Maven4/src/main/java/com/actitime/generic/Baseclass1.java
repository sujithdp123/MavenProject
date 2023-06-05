package com.actitime.generic;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.actitime.pom.Entertimetrack1;
import com.actitime.pom.Login1;


public class Baseclass1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
	}

	public WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void openbrowser(@Optional("chrome")String browser)
	{
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		Reporter.log("open browser", true);
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
	}
	@BeforeMethod
	public void login() throws IOException
	{
		Reporter.log("login", true);
            Login1 l= new Login1(driver);
//		FileLib1 fib = new FileLib1();
//		String un = fib.getPropertyData("username");
//		String pw = fib.getPropertyData("password");
		l.setLogin("admin","manager");
	}

	@AfterMethod
	public void logout()
	{
		Reporter.log("logout", true);
		Entertimetrack1 ett = new Entertimetrack1(driver);
		ett.getLogout().click();
	}




	@AfterTest
	public void closebrowser()
	{
		Reporter.log("close browser", true);
		
	}





}
