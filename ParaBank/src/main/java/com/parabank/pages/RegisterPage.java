package com.parabank.pages;

import com.parabank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    By registerLink = By.cssSelector("a[href='register.htm']");
    By signUpMessage = By.cssSelector(".title");

    By fName= By.xpath("//input[@id='customer.firstName']");
    By lName = By.xpath("//input[@id='customer.lastName']");
    By address = By.xpath("//input[@id='customer.address.street']");
    By city = By.xpath("//input[@id='customer.address.city']");
    By state = By.xpath("//input[@id='customer.address.state']");
    By zipCode = By.xpath("//input[@id='customer.address.zipCode']");
    By phone = By.xpath("//input[@id='customer.phoneNumber']");
    By ssn = By.xpath("//input[@id='customer.ssn']");

    By userName = By.xpath("//input[@id='customer.username']");
    By password = By.xpath("//input[@id='customer.password']");
    By confirmPassword = By.xpath("//input[@id='repeatedPassword']");

    By registerLink1 = By.xpath("//input[@value='Register']");

    By registerMessage = By.xpath("//p[contains(text(),'Your account was created successfully. You are now logged in')]");

    public void clickOnRegisterButton() {
        clickOnElement(registerLink);
    }


    public String getWelcomeMessage(){
        return getTextFromElement(signUpMessage);
    }


    public void enterFName(String fname) {
        Reporter.log("Enter email ID" +fname.toString());
        sendTextToElement(fName, fname);
    }

    public void enterLName(String lname) {
        Reporter.log("Enter email ID" +lname.toString());
        sendTextToElement(lName, lname);
    }

    public void enterAddress(String address1){
        Reporter.log("Enter email ID" +address1.toString());
        sendTextToElement(address, address1);
    }

    public void enterCity(String city1){
        Reporter.log("Enter email ID" +city1.toString());
        sendTextToElement(city, city1);
    }

    public void enterState(String state1){
        Reporter.log("Enter email ID" +state1.toString());
        sendTextToElement(state, state1);
    }

    public void enterPhone(String zipCode1){
        Reporter.log("Enter zipCode" +zipCode1.toString());
        sendTextToElement(phone, zipCode1);
    }

    public void enterZipCode(String zipCode1){
        Reporter.log("Enter zipCode" +zipCode1.toString());
        sendTextToElement(zipCode, zipCode1);
    }

    public void enter_ssn(String ssn1){
        Reporter.log("Enter email ID" +ssn1.toString());
        sendTextToElement(ssn, ssn1);
    }

    public void enter_userName(String userName1){
        Reporter.log("Enter email ID" +userName1.toString());
        sendTextToElement(userName, userName1);
    }

    public void enter_password(String password1){
        Reporter.log("Enter email ID" +password1.toString());
        sendTextToElement(password, password1);
    }
    public void enter_confirmPassword(String confirmPassword1){
        Reporter.log("Enter email ID" +confirmPassword1.toString());
        sendTextToElement(confirmPassword, confirmPassword1);
    }

    public void clickonRegisterButton1(){clickOnElement(registerLink1);}

    public String getSuccessMessage(){
        return  getTextFromElement(registerMessage);
    }
}
