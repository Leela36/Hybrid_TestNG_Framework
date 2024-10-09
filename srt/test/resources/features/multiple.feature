Feature: Login functionality with scenario outliine
Background: USer is already on home page
Given User is already on login page

Scenario Outline: Login with multiple Credentials 


When User enters an username "<username>"
And User enters an password "<password>"
And User clicks on submit button
Then User should naviage to the home page

Examples:
|username  |password        |
|Admin     |admin123        |
|leela     |admin123        |
|Admin     |jajs            |
|hi        | jhjs           |