package tutorialsninija.pages;

import tutorialsninija.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomePage extends Utility {

    By loginLink = By.cssSelector("input[value='Log In']") ;

    By registerLink = By.linkText("Register");

    public void clickOnLoginLink() {
        Reporter.log("Click on Login Link" +loginLink.toString()+"<br>");
        clickOnElement(loginLink);

    }




}
