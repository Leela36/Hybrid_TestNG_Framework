Feature: Rahulshetty login page
Scenario Outline: User needs to enter with multiple credentials
Given User is on R loginnpage
When User enters the u "<Username>"
And User enters the pwd "<password>"
And User clicks on the submit button
Then User should navigate to the rahulshettypage
Examples:
|Username             |password |
|Leela                |ksksk    |
|jd                   | jsjjs   |
|rahulshettyacademy   |learning |
