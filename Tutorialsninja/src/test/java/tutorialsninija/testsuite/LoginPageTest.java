package tutorialsninija.testsuite;

import tutorialsninija.pages.HomePage;
import tutorialsninija.pages.LoginPage;
import tutorialsninija.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Mahesh
 */
public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage= new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnLoginLink();
        String actualtext=loginPage.getWelcomeLogo();
        String expectedTest= "Experience the difference";
        Assert.assertEquals(actualtext,expectedTest);

    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("test123@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();
        String actualMessage =loginPage.getErrorMessage();
        String expectedMessage ="An internal error has occurred and has been logged.";
        Assert.assertEquals(actualMessage,expectedMessage);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("test");
        loginPage.enterPassword("test1");
        loginPage.clickOnLoginButton();
        String actualMessage =loginPage.getWelcomeMessage();
        String expectedMessage ="Welcome";
        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @Test
    public void userShouldLogOutSuccessfully(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("test");
        loginPage.enterPassword("test1");
        loginPage.clickOnLoginButton();
        loginPage.clickOnLogoutButton();
        String actualMessage =loginPage.getCustomerLogin();
        String expectedMessage ="Customer Login";
        Assert.assertEquals(actualMessage,expectedMessage);
    }

}
