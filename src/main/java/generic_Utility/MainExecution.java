package generic_Utility;

public class MainExecution {
	public static void main(String[] args) throws Exception {
		Properties_Utility pp=new Properties_Utility();
		System.out.println(pp.getDataFromProperties("url"));
		System.out.println(pp.getDataFromProperties("username"));
		System.out.println(pp.getDataFromProperties("password"));
		
		
	}
	
	

}
