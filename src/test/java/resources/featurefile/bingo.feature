Feature: Validate the login functionality
  User should be able to login with the valid credentials

  Scenario:User should be able to navigate to the login page
    Given I am on homepage
    When I click on login link "Log In"
    And enter Username "primeTest123@gmail.com"
    And password "123456"
    And Click on login button
    Then error message is displayed



