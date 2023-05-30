Feature: validate google signin

Scenario Outline: validate google signin


Given user visits google signin

When user type valid "<email>"  and valid "<password>" and click on next button

Then user should be able to signin to google account

Examples:
|email |  password|
|atgram22@gmail.com  | Nextech22 |

