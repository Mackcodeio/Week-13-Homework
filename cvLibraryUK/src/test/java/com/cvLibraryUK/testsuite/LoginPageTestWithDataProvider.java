package com.parabank.testsuite;

import com.parabank.pages.HomePage;
import com.parabank.pages.LoginPage;
import com.parabank.testbase.TestBase;
import org.testng.annotations.Test;
import resources.testdata.TestData;

/**
 * Created by Mahesh
 */
public class LoginPageTestWithDataProvider extends TestBase {

    HomePage homePage= new HomePage();
    LoginPage loginPage= new LoginPage();



    @Test (dataProvider = "logindata", dataProviderClass = TestData.class)
    public void doLogin(String username, String password){
    homePage.clickOnLoginLink();
    loginPage.loginToApplication(username,password);

    }

}
