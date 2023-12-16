package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverManager {

    //this is the way. we declare the locator as a variable
    @FindBy(css = ".ico-login")  //Locator will go as a variable
    public WebElement loginButton;

    // Action will go as a method
    public void clickOnLoginButton(){
        loginButton.click();
    }

}
