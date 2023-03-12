Feature: checking for Search functionality
  Scenario Outline:User wants to check the functionality of Search Box
    Given  User open the browser
    Then User enter the URL "https://smartbazaar.co.uk/"
    And User enters the '<search>' data
    Then User click on the search icon
    Then User verifies the '<search>' results
    When Use selects the '<desired>' product
    And user verifies the '<desired>'  product results
    Then User close the Browser
    Examples:
      | search | desired|
      | rice | Shree Krishna Maapillai Samba Rice (1kg)|
      | flower | Marigold Flowers – Orange (100g)|
