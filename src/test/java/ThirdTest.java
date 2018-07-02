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


public class ThirdTest {
    private static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        FirefoxProfile profile = new FirefoxProfile();
        String PROXY = "gproxy.corp.amdocs.com:8080";
        org.openqa.selenium.Proxy proxy = new org.openqa.selenium.Proxy();
        proxy.setHttpProxy(PROXY).setFtpProxy(PROXY).setSslProxy(PROXY);
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(CapabilityType.PROXY, proxy);
        driver = new FirefoxDriver(cap);
//
//        profile.setPreference("network.proxy.type", 1);
//        profile.setPreference("network.proxy.socks", "gproxy.corp.amdocs.com");
//        profile.setPreference("network.proxy.socks_port", 8080);
        //driver = new FirefoxDriver();
    }

    @AfterClass
    public static void afterClass() {
        driver.quit();
    }

    @Test
    public void verifySearchButton() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.google.com/?hl=en");

        String search_text = "Google Search";
        WebElement search_button = driver.findElement(By.name("btnK"));

        String text = search_button.getAttribute("value");

        Assert.assertEquals(text, search_text,"Text not found!" );
    }
    @Test
    public void gmailLogin() {

        String appUrl = "https://accounts.google.com";
        // launch the firefox browser and open the application url
        driver.get("https://gmail.com");

        // maximize the browser window
        driver.manage().window().maximize();

        // declare and initialize the variable to store the expected title of the webpage.
        String expectedTitle = "Gmail";//"Sign in - Google Accounts";

        // fetch the title of the web page and save it into a string variable
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

        // enter a valid username in the email textbox
        WebElement username = driver.findElement(By.id("Email"));
        username.clear();
        username.sendKeys("TestSelenium");

        // enter a valid password in the password textbox
        WebElement password = driver.findElement(By.id("Passwd"));
        password.clear();
        password.sendKeys("password123");

// click on the Sign in button
        WebElement SignInButton = driver.findElement(By.id("signIn"));
        SignInButton.click();

// close the web browser
        driver.close();
    }
}
