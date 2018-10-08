import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class F8181_1_3ThirdTest {
    @Test
    public void TestIE()
    {
    	  System.setProperty("webdriver.ie.driver", "C:\\Selenium WebDriver\\IEDriver\\IEDriverServer.exe");
    	  final WebDriver driver = new InternetExplorerDriver();
    	  driver.get("http://www.google.com");
    	  driver.findElement(By.name("q")).sendKeys("test");
    	  driver.findElement(By.name("q")).submit();
    	  driver.quit();
    }
    
}
