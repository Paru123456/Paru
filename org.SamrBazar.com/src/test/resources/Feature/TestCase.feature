#Author
  Feature: Checking the Title of application
    Scenario: User wants to check whether application is working or not
      Given User open the browser
      Then User enter the URL "https://smartbazaar.co.uk/"
      And User verifies the title of the application
      Then User close the Browser