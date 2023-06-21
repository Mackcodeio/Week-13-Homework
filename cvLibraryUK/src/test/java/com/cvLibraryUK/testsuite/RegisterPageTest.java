package com.parabank.testsuite;

import com.parabank.pages.HomePage;
import com.parabank.pages.RegisterPage;
import com.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {

    HomePage homePage = new HomePage();
    RegisterPage register = new RegisterPage();

    @Test
    public void verifyThatSigningUpPageDisplay(){
        homePage.clickOnLoginLink();
        register.clickOnRegisterButton();
        String actualMessage = register.getWelcomeMessage();
        String expectedMessage ="Signing up is easy!";
        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully(){
        verifyThatSigningUpPageDisplay();
        register.enterFName("Mahesh");
        register.enterLName("Hirpara");
        register.enterAddress("Croydon");
        register.enterCity("UK");
        register.enterState("London");
        register.enterZipCode("SW1 DFS");
        register.enterPhone("121211");
        register.enter_ssn("23232");
        register.enter_userName("test23");
        register.enter_password("test1");
        register.enter_confirmPassword("test1");
        register.clickonRegisterButton1();
        String actualMessage =register.getSuccessMessage();
        String expectedMessage ="Your account was created successfully. You are now logged in";
        Assert.assertEquals(actualMessage,expectedMessage);
    }
}
