package HMSTestProject.HMSTestProject;

import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class HMSProject 
{
    public  void fn_launchBrowser()
    {
    	FirefoxDriver ff=new FirefoxDriver();
    	ff.manage().window().maximize();
    	ff.get("http://www.google.com");
        System.out.println( "Hello World!" );
    }
}
