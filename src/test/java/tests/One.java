package tests;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;

public class One extends Base {

	public WebDriver driver ;
	@Test
	public  void TestOne () throws InterruptedException {
		
		driver.get("https://the-internet.herokuapp.com/");  
		Thread.sleep(15000);
		System.out.println("Class: One.Thread :"+Thread.currentThread().threadId()+" The Title of this page from chrome node is :"+driver.getTitle());
	}
	
	@BeforeMethod
	public  void SetUp () throws MalformedURLException, URISyntaxException {

		driver = InitializeBrowser("chrome");

	}
	
	@AfterMethod
	public  void TearDown () {
		driver.quit();
	}

}
