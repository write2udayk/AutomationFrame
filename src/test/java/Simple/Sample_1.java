package Simple;

import org.testng.annotations.Test;

public class Sample_1 {
	
	@Test()
	public void createUser() {
		System.out.println("user created!!");
	}
	
	@Test(priority = 1)
	public void modifyUser() {
		System.out.println("User Modified!!");
	}
	
	@Test 
	public void deleteUser() {
		System.out.println("user Deleted!!");
	}

}
