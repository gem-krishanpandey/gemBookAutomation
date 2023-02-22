Feature: Launch Gembook and SignIn

  Background: User Login into the Gembook Application
    When URL is launched
    When User clicks on signIn Button

  Scenario Outline:
    Then User enters the "<username>"
    Then User enters the "<password>"
#    And User logins into the application
#    Then Verify user is logged into the application or not
  Examples:
    |username |password|
    |krishan.pandey@geminisolutions.com|hello#123|