Feature: As a user, I should be able create facebook  account

Scenario: Create facebook account successfully with valid data

Given I am in Facebook home page
When I click on create account button
Then I able to see the sign up form
When I fill form with firstName Zayan , lastname Islam and email rsonia_islam@yahoo.com and age 21
#Then I click on submit button
#And I am able to create facebook account successfully


