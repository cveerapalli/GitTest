package ChandraTest.gittest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\Work\\geckodriver.exe";
    public WebDriver driver ; 
    
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        System.out.println("launching firefox browser"); 
        System.setProperty("webdriver.gecko.driver", driverPath);
        driver = new FirefoxDriver();
        driver.get(baseUrl);
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        //assert.assertEquals(actualTitle, expectedTitle);
        driver.close();
        assertTrue( true );
    }
}
