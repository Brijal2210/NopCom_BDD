@BJC
Feature: Search Functionality
  As an end user
  I want to search for a product
  So that I can view the search result

Scenario: Search for a Product
  Given I am on home page
  When I search for a product "Nike"
  Then I should be able to see the respective product