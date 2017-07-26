package HMSTestProject.HMSTestProject;

import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class HMSProjectTest 
{
   
@Test()
public void fn_TC(){
	HMSProject HMS=new HMSProject();
	HMS.fn_launchBrowser();
	System.out.println("Hello Hi");
	System.out.println("I'm in test class");
}

}
