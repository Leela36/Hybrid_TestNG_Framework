Feature: Login functionality
Background:
Given User is on login page

Scenario: Login with Valid Credentials
When User enters username "Admin"
And User enters password "admin123"
And User clicks on login button
Then User should login to the home page



#Scenario: Login with Valid username and invalid password
#
#When User enters username "nennuruleelaveni@gmail.com"
#And User enters password "Th@2210"
#And User clicks on login button
#Then User gets a warning message 
#
#Scenario: Login with invalid username and valid password
#
#When User enters username "nennueelaveni@gmail.com"
#And User enters password "Thatha@2210"
#And User clicks on login button
#Then User gets a warning message 
#
#
#Scenario: Login without providing credentials
#
#When User clicks on login button
#Then User gets a warning message like required field
