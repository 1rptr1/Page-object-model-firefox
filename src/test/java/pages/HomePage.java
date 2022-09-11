package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.logs.Log;

public class HomePage extends BasePage {
    /**
     * Constructor
     */
    public HomePage(WebDriver driver) {
        super(driver);
    }

    /**
     * Variables
     */
    String baseURL = "https://selectorshub.com";

    /**
     * Web Elements
     */
    //By signInButtonClass = By.className("btnSignIn");
    By products      =   By.xpath("//li[@id='menu-item-27']");
    By pro_plans     =   By.xpath("//li[@id='menu-item-33']");
    By courses       =   By.xpath("//li[@id='menu-item-1075']");
    By practice_page =   By.xpath("//li[@id='menu-item-4098']");
    By resources     =   By.xpath("//li[@id='menu-item-36']");
    By about         =   By.xpath("//li[@id='menu-item-48']");
    By search        =   By.xpath("//input[@type='search']");

    /**
     * Page Methods
     */
    //Go to Homepage
    public HomePage goToSelectorsHub() {
        Log.info("Opening the Website.");
        driver.get(baseURL);
        return this;
    }

    //Go to LoginPage
    public practicePage goToPracticePage() {
        Log.info("Going to practice page");
        click(practice_page);
        return new practicePage(driver);
    }
}