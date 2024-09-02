package TC_Repo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Object_Repository.CreateNewOrgPage;
import Object_Repository.Home_Page;
import Object_Repository.OrgHomePage;
import generic_Utility.BaseClass;
import generic_Utility.Excel_Utility;
import generic_Utility.Java_Utility;

@Listeners(generic_Utility.ListenerImplementationClass.class)
public class OR_01 extends BaseClass {
	
	@Test
	public void or_Case01() throws Exception {
		
		Java_Utility JUTIL =new Java_Utility();
		int num= JUTIL.getRandomNumber(1000);
		Excel_Utility EUTIL =new Excel_Utility();
		
		String ORGNAME= EUTIL.getIndividualTestDate("Organization", 2, 1);
		String WEBSITE= EUTIL.getIndividualTestDate("Organization", 2, 2);
		String EMP_ID= EUTIL.getIndividualTestDate("Organization", 2, 3);
		
		Home_Page hp=new Home_Page(driver);
		hp.clickOnOrg();
		
		OrgHomePage og=new OrgHomePage(driver);
		og.clickOnNewOrgButton();
		
		CreateNewOrgPage cog=new CreateNewOrgPage(driver);
		cog.createorganisation(ORGNAME+num, WEBSITE, EMP_ID);
		System.out.println("Org First(01) TestCase Successfull!! ");
		Thread.sleep(3000);
		
		
		
	}

}
