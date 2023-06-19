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
        String actualMessage =register.getWelcomeMessage();
        String expectedMessage ="Signing up is easy!";
        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully(){
        verifyThatSigningUpPageDisplay();
        //register.enter
    }
}
