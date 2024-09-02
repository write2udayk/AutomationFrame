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
public class LE_04 extends BaseClass {	
	@Test(groups = {"regression","smoke"})
	public void le_04Case() throws Exception{
		Java_Utility JTUIL =new Java_Utility();
		int num =JTUIL.getRandomNumber(1000);
		Excel_Utility EUTIL=new Excel_Utility();
		String FIRSTNAME=EUTIL.getIndividualTestDate("leads", 2,1);
		String LASTNAME=EUTIL.getIndividualTestDate("leads", 2,2);
		String COMPANY=EUTIL.getIndividualTestDate("leads", 2,3);
		String STREET=EUTIL.getIndividualTestDate("leads", 2,1);
		String POBOX=EUTIL.getIndividualTestDate("leads", 2,2);
		String POSTALCODE=EUTIL.getIndividualTestDate("leads", 2,3);
		String CITY=EUTIL.getIndividualTestDate("leads", 2,1);
		String COUNTRY=EUTIL.getIndividualTestDate("leads", 2,2);
		String STATE=EUTIL.getIndividualTestDate("leads", 2,3);
		
		Home_Page hp = new Home_Page(driver);
		hp.clickOnLeads();
		LeadsHomePage ip= new LeadsHomePage(driver);
		ip.clickOnNewLeadsButton();
		CreateNewLeadsPage ch =new CreateNewLeadsPage(driver);
		ch.createLeads(FIRSTNAME+num, LASTNAME, COMPANY, STREET, POBOX, POSTALCODE, CITY, COUNTRY, STATE);
		System.out.println(" LE_04 Completed successfully ");
		Thread.sleep(400);
		
	}
	
}
