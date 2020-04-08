package com.orangehrm.testbase;

import com.orangehrm.basepage.BasePage;
import com.orangehrm.browserSelector.BrowserSelector;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {
    //object creation for browser selector
    BrowserSelector browserSelector = new BrowserSelector();

    //stored variable in baseUrl
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    //before method comes from TestNG to do action before method
    @BeforeMethod
    public void openBrowser() {
        //below code to open chrome browser
        browserSelector.selectBrowser("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);

    }

    // //after method comes from TestNG to do action after class
    @AfterMethod
    public void tearDown() {
        //below code closed browsers
        driver.quit();
    }


}

