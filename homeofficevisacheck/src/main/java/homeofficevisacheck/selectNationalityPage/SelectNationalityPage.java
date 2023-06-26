package homeofficevisacheck.startPage;

import homeofficevisacheck.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class SelectNationalityPage extends Utility {

    By startNow = By.cssSelector(".gem-c-button.govuk-button.govuk-button--start");

    public void clickStartNow() {
        Reporter.log("Click on Login Link" +startNow.toString()+"<br>");
        clickOnElement(startNow);
    }
}
