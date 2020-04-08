package com.orangehrm.testsuite;

import com.orangehrm.pages.LoginPage;
import com.orangehrm.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    //object created
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldEnterValidUsername() {
        //below methods calling from pages package
        loginPage.setUserNameField();
        loginPage.setPasswordField();
        loginPage.setClickOnLoginButton();
        //compare expected with actual result
        String expectedResult = "Welcome Admin";
        String actualResult = loginPage.getWelcomeAdminText();
        Assert.assertEquals(expectedResult, actualResult);

    }
}

