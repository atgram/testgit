Feature: validate amazon pharmacy

Scenario Outline: amazon pharmacy

    Given user visits amazon homepage
    When user type "<productname>" and click on search icon
    Then user should be able to go to pharmacy page
    
    Examples:
    |productname|
    |pharmacy|