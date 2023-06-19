package com.parabank.pages;

import com.parabank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    By registerLink = By.cssSelector("a[href='register.htm']");
    By signUpMessage = By.cssSelector(".title");

    By fname = By.cssSelector("body > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > form:nth-child(3) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > input:nth-child(1)");


    public void clickOnRegisterButton() {
        clickOnElement(registerLink);
    }

    public String getWelcomeMessage(){
        return getTextFromElement(signUpMessage);
    }

    public void enterEmailId(String email) {
        Reporter.log("Enter email ID" +email.toString());
        sendTextToElement(emailfield, email);
    }
}
