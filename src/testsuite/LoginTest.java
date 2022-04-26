package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldLoginSuccessfullyWithValidCredentials() {

        //enter username
        sendTextToElement(By.id("txtUsername"), "Admin");
        //enter password
        sendTextToElement(By.name("txtPassword"), "admin123");
        //click on login button
        clickOnElement(By.id("btnLogin"));
        verifyElements("Welcome message not displayed", "Welcome Fathi", By.id("welcome"));

    }

    @After
    public void tearDown() {
        closeBrowser();
    }


}
