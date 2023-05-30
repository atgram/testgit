@Facebookloginhappypath

Feature: Validate facebook login

Scenario Outline: facebook login

Given User visits facebook home page
When User enters valid "<email>" and valid "<password>"
When User clicks on login button
Then user will be able to successfully login.

Examples:
| email | password |
| atgram@gmail.com | Nextech22 |