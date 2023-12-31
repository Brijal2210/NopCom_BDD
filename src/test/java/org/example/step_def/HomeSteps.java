package org.example.step_def;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.HomePage;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.core.StringEndsWith.endsWith;

public class HomeSteps extends DriverManager {
    DriverManager driverManager = new DriverManager();
    HomePage homePage = new HomePage(); //  we have to create an object of HomePage
    @Given("^I am on home page$")
    public void i_am_on_home_page() throws Throwable {
        String myActualURL = driverManager.getCurrentURL();
        System.out.println(myActualURL);

        assertThat(myActualURL,is(endsWith("nopcommerce.com/")));

        //       validation through title
        String actualTitle=driverManager.getPageTitle();
        System.out.println(actualTitle);
        assertThat(actualTitle,is(equalToIgnoringCase("nopCommerce demo store")));

    }

    @When("^I click on login button$")
    public void i_click_on_login_button() throws Throwable {
        homePage.clickOnLoginButton();  // So this method will do click(Action)


    }

}
