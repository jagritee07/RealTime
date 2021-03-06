package Academy.E2EProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class validateNavigationBar extends base {
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 
			
		driver.get(prop.getProperty("url"));
		
	}
	@Test

	public void validateAppNavBar() throws IOException
	{

		//one is inheritance
		// creating object to that class and invoke methods of it
		LandingPage l=new LandingPage(driver);

		//compare the text from the browser with actual text.- Error..
		Assert.assertTrue(l.getNavigationBar().isDisplayed());

		//   Assert.assertFalse(false);
		;


	}
	@AfterTest
	public void teardown()
	{
		
		driver.close();
	
		
	}


}
