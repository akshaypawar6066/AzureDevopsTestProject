Feature: Home Page Functionality

Scenario: Validation of title
Given User is at landing page
Then Verify title of the page should contains "Shopping site" 

Scenario: Verify cart icon
Given User is at landing page
Then Cart icon should be displayed

Scenario: Checkout the deals section
Given User is at landing page
When user clicks on smart phones deal
Then deal section should get open

Scenario: Login tocapplication
Given User is at landing page
When user clicks on signin button
And user enters username as "8369038453" and clicks on continue button
And user enters password as "akshay6066" and clicks on login button
Then user should logged in successfully
