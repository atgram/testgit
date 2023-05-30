Feature: validate Amazon mens shoe

Scenario Outline: validate Amazon mens shoe

  Given user visits Amazon home page
  When  user type"<productname>" and click on search icon
  Then  user should be able to see the shoes
  
  
  Examples: 
  |productname |
  |mens shoe |