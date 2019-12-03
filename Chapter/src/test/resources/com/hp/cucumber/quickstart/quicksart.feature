Feature: Test Git Hub Web Application
  In order to Test Git Web Application As a user
  I want to specify the application flow

  Scenario: Web Site loads application should be quick
    Given application  URL is ready with the user
    When user enter the URL in browser
    Then application page loads
