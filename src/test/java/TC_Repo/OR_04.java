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
public class OR_04 extends BaseClass {
	@Test
	public void or_Case01() throws Exception {

		Java_Utility JUTIL = new Java_Utility();
		int num = JUTIL.getRandomNumber(1000);
		Excel_Utility EUTIL = new Excel_Utility();

		String ORGNAME = EUTIL.getIndividualTestDate("Organization", 11, 1);
		String WEBSITE = EUTIL.getIndividualTestDate("Organization", 11, 2);
		String EMP_ID = EUTIL.getIndividualTestDate("Organization", 11, 3);
		String PHONE = EUTIL.getIndividualTestDate("Organization", 11, 4);
		String OTHERPHONE = EUTIL.getIndividualTestDate("Organization", 11, 5);
		String MAIL = EUTIL.getIndividualTestDate("Organization", 11, 6);
		String BILLINGSCITY= EUTIL.getIndividualTestDate("Organization", 11, 7);
		String BILLINGSTATE= EUTIL.getIndividualTestDate("Organization", 11, 8);
		String BILLINGADDRESS= EUTIL.getIndividualTestDate("Organization", 11, 9);
		
		Home_Page hp = new Home_Page(driver);
		hp.clickOnOrg();

		OrgHomePage og = new OrgHomePage(driver);
		og.clickOnNewOrgButton();

		CreateNewOrgPage cog = new CreateNewOrgPage(driver);
		cog.createorganisation(ORGNAME+num, WEBSITE, EMP_ID, PHONE, OTHERPHONE, MAIL, BILLINGSCITY, BILLINGSTATE, BILLINGADDRESS);
		System.out.println("Org Fourth(03) TestCase Successfull!! ");
		Thread.sleep(3000);

	}
}
