Feature: feature to test login functionality

  Scenario: Check loging is successful with valid credentials
    Given open the browser
    When user is on login page
    When user enters username and password
    When clicks on login button
    Then user is navigated to the home page
    Then close window
 