package TC_Repo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Object_Repository.CreateNewLeadsPage;
import Object_Repository.Home_Page;
import Object_Repository.LeadsHomePage;
import generic_Utility.BaseClass;
import generic_Utility.Excel_Utility;
import generic_Utility.Java_Utility;

@Listeners(generic_Utility.ListenerImplementationClass.class)
public class LE_03 extends BaseClass {
	@Test(groups = {"regression"})
	public void le_03Case() throws Exception{
		
		Java_Utility JTUIL =new Java_Utility();
		int num =JTUIL.getRandomNumber(1000);
		Excel_Utility EUTIL=new Excel_Utility();
		
		String FIRSTNAME=EUTIL.getIndividualTestDate("leads", 8,1);
		String LASTNAME=EUTIL.getIndividualTestDate("leads", 8,2);
		String COMPANY=EUTIL.getIndividualTestDate("leads",8,3);
		String TITLE=EUTIL.getIndividualTestDate("leads", 8,4);
		String PHONE=EUTIL.getIndividualTestDate("leads", 8,5);
		String MOBILE=EUTIL.getIndividualTestDate("leads", 8,6);
		String EMAIL=EUTIL.getIndividualTestDate("leads", 8,7);
		String NOE=EUTIL.getIndividualTestDate("leads", 8,8);
		
		Home_Page hp = new Home_Page(driver);
		hp.clickOnLeads();
		
		LeadsHomePage ip= new LeadsHomePage(driver);
		ip.clickOnNewLeadsButton();
		
		CreateNewLeadsPage ch =new CreateNewLeadsPage(driver);
		ch.createLeads(FIRSTNAME+num, LASTNAME, COMPANY, TITLE, PHONE, MOBILE, EMAIL, NOE);
		
		System.out.println(" LE_03 Completed successfully ");
		Thread.sleep(3000);
		
		
		
	}
}
