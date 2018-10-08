

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
