package testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/ ";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // Find log in link and click on login link
        sendTextToElement(By.name("username"), "Admin");

        // Find the password field element
        sendTextToElement(By.name("password"), "admin123");

        // Find the login button and click on it
        clickOnElement(By.xpath("//button[@type='submit']"));
        String expectedMessage = "Dashboard";

        // Find the welcome text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//h6[text() = 'Dashboard']"));
        Assert.assertEquals("Dashboard is not open", expectedMessage, actualMessage);
    }


}



