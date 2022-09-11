package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.logs.Log;

public class BaseTest {
    public WebDriver driver;
    public HomePage  homePage;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void classSetup() {
        Log.info("Tests starting!");
        System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @BeforeMethod
    public void Setup() {
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void teardown() {
        Log.info("Tests ended");
        driver.quit();
    }
}