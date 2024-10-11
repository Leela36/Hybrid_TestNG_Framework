Feature: Para Bank functionality
Scenario: User needs to register the para bank account
Given User is on Para bank login page
When User needs to click on register button
And User enters username "Leela"
And User needs to fill all the mandatory fields to register
And User needs to click on register button
Then User will navigate to para bank home page.
