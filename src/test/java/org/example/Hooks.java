package org.example;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.example.driver.DriverManager;

public class Hooks {//here call the reusable method from the  DriverManager, so we need to create an object
    DriverManager driverManager = new DriverManager();
    @Before
    public void setUpMethod() throws IllegalAccessException {
        driverManager.runOnLocalBrowser();
        driverManager.maxBrowser();
        driverManager.openURL();
        driverManager.applyImplicitWait();

    }



    @After
    public void tearDownMethod() throws InterruptedException {
        driverManager.sleepBrowser(5000);
        //driverManager.closeBrowser();

    }





}
