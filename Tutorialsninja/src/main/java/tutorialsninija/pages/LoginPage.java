package tutorialsninija.pages;

import tutorialsninija.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;


public class LoginPage extends Utility {

    By welcomeLogo = By.cssSelector(".caption");
    By emailfield = By.cssSelector("input[name='username']");
    By passwordField = By.cssSelector("input[name='password']");
    By loginButton = By.cssSelector("input[value='Log In']");
    By errorMag = By.cssSelector(".error");

    By welcomeMessage = By.cssSelector("p[class='smallText'] b");

    By logoutButton = By.cssSelector("a[href='/parabank/logout.htm']");

    By customerLogin = By.cssSelector("div[id='leftPanel'] h2");


    public String getWelcomeLogo() {

        Reporter.log("get welcome text" +welcomeLogo.toString());
        return getTextFromElement(welcomeLogo);
    }

    public void enterEmailId(String email) {
        Reporter.log("Enter email ID" +email.toString());
        sendTextToElement(emailfield, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMag);
    }

    public String getWelcomeMessage(){
        return getTextFromElement(welcomeMessage);
    }

    public String getCustomerLogin(){
        return getTextFromElement(customerLogin);
    }

    public void clickOnLogoutButton(){
        clickOnElement(logoutButton);
    }
    public void loginToApplication(String username, String password) {
        enterEmailId(username);
        enterPassword(password);
        clickOnLoginButton();
    }


}
