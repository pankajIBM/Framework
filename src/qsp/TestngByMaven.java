package qsp;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngByMaven {

	@BeforeSuite
	public void apple()
	{
		Reporter.log("APPLE",true);
	}
	
	@AfterSuite
	public void india()
	{
		Reporter.log("INDIA",true);
	}
	
	@BeforeTest
	public void ball()
	{
		Reporter.log("BALL",true);
	}

	@AfterTest
	public void horse()
	{
		Reporter.log("HORSE",true);
	}

	@BeforeClass
	public void cat()
	{
		Reporter.log("CAT",true);
	}

	@AfterClass
	public void garden()
	{
		Reporter.log("GARDEN",true);
	}

	@BeforeMethod
	public void dolphin()
	{
		Reporter.log("DOLPHIN",true);
	}

	@AfterMethod
	public void flower()
	{
		Reporter.log("FLOWER",true);
	}
	
	@Test
	public void elephant()
	{
		Reporter.log("ELEPHANT",true);
	}


}
