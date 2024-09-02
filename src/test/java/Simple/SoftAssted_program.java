package Simple;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssted_program {
	@Test
	public void strictLevelComparison() {
		String expecteddata="raja";
		String actualData="Raja";
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actualData, expecteddata);
		
		System.out.println("strick comaprson passed!!");
		sa.assertAll();
	}
	
	@Test
	public void containsLevelComparison() {
		String expecteddata="raja";
		String actualData="maharaja";
		
		SoftAssert ss=new SoftAssert();
		ss.assertTrue(actualData.contains(expecteddata));
		
		System.out.println("conteins Level comparison passed!!");
		ss.assertAll();
	}
	
	
}
