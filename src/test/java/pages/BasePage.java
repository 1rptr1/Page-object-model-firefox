package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    //Constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //Click Method
    public void click(By by) {
        waitVisibility(by).click();
    }

    //Write Text
    public void writeText(By by, String text) {
        waitVisibility(by).sendKeys(text);
    }

    //Read Text
    public String readText(By by) {
        return waitVisibility(by).getText();
    }

    //Clear Text
    public String clearText(By by) {
        return waitVisibility(by).getText();
    }

    //Get Attribute
    public String getAttribute(By by,String attribute) {
        return waitVisibility(by).getAttribute(attribute);
    }

    //Explicit Wait
    public WebElement waitVisibility(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    //Implicit Wait
    public void implicitWait(int duration){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
    }

    //fluent wait
    public void fluentWait(){
          Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
    }
}