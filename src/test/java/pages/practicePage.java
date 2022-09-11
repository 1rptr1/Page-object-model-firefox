package pages;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.logs.JSErrorLogs;
import utils.logs.Log;

public class practicePage extends BasePage {
    /**
     * Constructor
     */
    public practicePage(WebDriver driver) {
        super(driver);
    }

    /**
     * Web Elements
     */
    By userEmailId                = By.xpath("//input[@id='userId']");
    By passwordId                   = By.xpath("//input[@id='pass']");
    By companyId                   = By.xpath("//input[@name='company']");
    By submit                     = By.xpath("//input[@type='submit']");
    By errorMessageUsernameXpath = By.xpath("//*[@id=loginForm]/div[1]/div/div");
    By errorMessagePasswordXpath = By.xpath("//*[@id=loginForm]/div[2]/div/div ");

    /**
     * Page Methods
     */
    public practicePage loginToSH(String username, String password,String company) {
        Log.info("Trying to login the N11.");
        implicitWait(10);
        click(userEmailId);
        writeText(userEmailId, username);
        click(passwordId);
        writeText(passwordId, password);
        click(companyId);
        writeText(companyId, company);
        click(submit);
        return this;
    }

    //Verify Username Condition
   /* public practicePage verifyLoginUserName(String expectedText) {
        Log.info("Verifying login username.");
        waitVisibility(errorMessageUsernameXpath);
        assertEquals(readText(errorMessageUsernameXpath), expectedText);
        return this;
    }

    //Verify Password Condition
    public practicePage verifyLogError() {
        Log.info("Verifying javascript login errors.");
        assertTrue(JSErrorLogs.isLoginErrorLog(driver));
        return this;
    }*/
}