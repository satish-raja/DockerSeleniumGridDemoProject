package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.lang.Process;

public class Setup_DockerGrid {

//	public Process p;
	 
//	@SuppressWarnings("deprecation")
	@BeforeTest
	void startDockergrid() throws IOException, InterruptedException
	{
		System.out.println("BeforeTest");
//	p =  Runtime.getRuntime().exec("cmd /c start start_dockergrid.bat") ;           
//	Thread.sleep(15000);
	}
		
//	@SuppressWarnings("deprecation")
	@AfterTest
	void stopDockergrid() throws IOException, InterruptedException
	{
		System.out.println("AfterTest");
//	  Runtime.getRuntime().exec("cmd /c start stop_dockergrid.bat"); 
//      Thread.sleep(5000);
//      Runtime.getRuntime().exec("taskkill /f /im cmd.exe") ; //closes cmd's 
    }
}
