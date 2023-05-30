@Twitersignuphappypath
Feature: Twiter sign up

In order to verify search
as a uger
i want to Twiter sign up

Scenario Outline:
Given user visiting Twiter url
When user click create account and enter "<name>" and valid "<phone_number>" 
When user click dropdown Month and dropdown Day and dropdown Year
Then user will be able to click on next button
Examples:
| name|  phone_number  |
|  Mohammed      | 2143990508|