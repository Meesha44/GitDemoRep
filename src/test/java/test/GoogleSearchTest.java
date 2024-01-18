package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.GoogleSearchPage;

public class GoogleSearchTest extends Base{
	GoogleSearchPage GoogleSearch;
	public GoogleSearchTest()
	{
		super();
	}
	
	@BeforeMethod
	public void SetUp()
	{
		Initialization();
		GoogleSearch= new GoogleSearchPage();
	}
	
	@Test
	public void SeleniumTest()
	{
	Boolean result;
	try {
		
		result = GoogleSearch.SearchResult("Selenium");
		//Added comments
		Assert.assertTrue(result);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
	
}
