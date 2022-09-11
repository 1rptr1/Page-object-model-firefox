package tests;

import static utils.extentreports.ExtentTestManager.startTest;

import java.lang.reflect.Method;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    @Test(priority = 0, description = "valid Scenario with username ,password  and company.")
    public void sendingDetailsToPage(Method method) {
        //ExtentReports Description
        startTest(method.getName(), "valid Scenario with username ,password  and company.");

        homePage
            .goToSelectorsHub()
            .goToPracticePage()
            .loginToSH("Saurav@gmail.com","tomtom@123","Dell");

    }

}