

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class F8181_1_4ForthTest {

//    private static WebDriver driver;

//    @BeforeClass
//    public static void beforeClass() {
//        FirefoxProfile profile = new FirefoxProfile();
//        String PROXY = "gproxy.corp.amdocs.com:8080";
//        org.openqa.selenium.Proxy proxy = new org.openqa.selenium.Proxy();
//        proxy.setHttpProxy(PROXY).setFtpProxy(PROXY).setSslProxy(PROXY);
//        DesiredCapabilities cap = new DesiredCapabilities();
//        cap.setCapability(CapabilityType.PROXY, proxy);
//        driver = new FirefoxDriver(cap);
//
//        profile.setPreference("network.proxy.type", 1);
//        profile.setPreference("network.proxy.socks", "gproxy.corp.amdocs.com");
//        profile.setPreference("network.proxy.socks_port", 8080);
        //driver = new FirefoxDriver();
    }

//    @AfterClass
//    public static void afterClass() {
        //driver.quit();
//    }

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
    
    @Test
    public void TestChrome()
    {
    	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDriver\\ChromeDriver\\chromedriver.exe");
    	  final WebDriver driver = new ChromeDriver();
    	  driver.get("http://www.google.com");
    	  driver.findElement(By.name("q")).sendKeys("test");
    	  driver.findElement(By.name("q")).submit();
    	  driver.quit();
    }
}
