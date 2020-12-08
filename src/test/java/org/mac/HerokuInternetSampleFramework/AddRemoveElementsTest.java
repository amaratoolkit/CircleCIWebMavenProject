package org.mac.HerokuInternetSampleFramework;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.mac.HerokuInternetSampleFramework.webPages.AddRemoveElementsPage;
import org.mac.HerokuInternetSampleFramework.webPages.HomePage;
import org.testng.Assert;
import org.testng.annotations.*;



public class AddRemoveElementsTest extends BaseTest{
	public HomePage homePage;
	public AddRemoveElementsPage addRemoveElementsPage;
	
	@BeforeTest
	public void initiazePages() {
		homePage = new HomePage(driver);
		addRemoveElementsPage = new AddRemoveElementsPage(driver);
	}
	
	@Test
	public void verifyAddedDeleteButtons() {
		homePage.clickOnaddRemoveLink();
		addRemoveElementsPage.addMultipleDeleteButtons(5);
		
		AssertJUnit.assertEquals(addRemoveElementsPage.getNumnberOfButtons(), 5);
	}
	
	@Test(dependsOnMethods = "verifyAddedDeleteButtons")
	public void verifyDeletedDeleteButtons() {
		addRemoveElementsPage.removeDeleteButtons(5);
		
		AssertJUnit.assertEquals(addRemoveElementsPage.getNumnberOfButtons(), 0);
	}
	

}
