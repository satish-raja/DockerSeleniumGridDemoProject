package tests;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;

public class Two extends Base {

	public WebDriver driver ;
	@Test
	public  void TestTwo () throws InterruptedException {

		driver.get("https://the-internet.herokuapp.com/");  
		Thread.sleep(15000);
		System.out.println("Class: Two.Thread :"+Thread.currentThread().threadId()+" The Title of this page from firefox node is :"+driver.getTitle());
	}
	
	@BeforeMethod
	public  void SetUp () throws MalformedURLException, URISyntaxException {

		driver = InitializeBrowser("firefox");

	}
	
	@AfterMethod
	public  void TearDown () {
		driver.quit();
	}

}
