@BJC
Feature: Login Functionality
  As an end user
  I want to login to the website
  So that I can check my account

  Scenario: Validate Login Page
    Given  I am on home page
    When I click on login button
    Then I should see the "Welcome, Please Sign In!" text on login page
    And  the URL should contain with "/login"