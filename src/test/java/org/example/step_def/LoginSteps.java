package org.example.step_def;

import cucumber.api.java.en.Then;
import org.example.driver.DriverManager;
import org.example.pages.LoginPage;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class LoginSteps extends DriverManager {

    DriverManager driverManager = new DriverManager();
    LoginPage loginPage =  new LoginPage();
    @Then("^I should see the \"([^\"]*)\" text on login page$")
    public void i_should_see_the_text_on_login_page(String expectedText) throws Throwable {
        System.out.println(expectedText);
        String myActualWelcomeText = loginPage.getWelcomeTextOnLoginPage();
        System.out.println(myActualWelcomeText);

        assertThat(myActualWelcomeText, is(equalToIgnoringCase(expectedText))); // for validation

    }

    @Then("^the URL should contain with \"([^\"]*)\"$")
    public void the_URL_should_contain_with(String expectedURLText) throws Throwable {
       String myActualCurrentURL = driverManager.getCurrentURL();
        System.out.println(myActualCurrentURL);

        assertThat(myActualCurrentURL, containsString(expectedURLText));


    }
}