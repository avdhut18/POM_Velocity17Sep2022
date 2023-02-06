package test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PIMTest extends CommonTest {
	
	@Test(priority=3,groups= {"smoke","regression"})
	public void verifyPimPageTitle() {
		pimPage.clicknPimPageLink();
		String verifyTitleOfPim = pimPage.getPimPageTitle();
		Assert.assertEquals(verifyTitleOfPim, "PIM");
	}	
	
	@Test(priority=4,groups= {"smoke","regression"})
	public void verifyEmpSearchEmpId() {
		pimPage.setPimPageEmpId("0283");
		pimPage.clickSearchBtn();
		String verifyEmpIdAppeared= pimPage.getEmpIdFromSearchedResults("0283");
		Assert.assertEquals(verifyEmpIdAppeared, "0283");
	}
}
