@Important
Feature: Login Functionality of Linkedin using tags

Background: Common step to launch Linkedin page
Given User need to be on Linkedin Login page

@Regression
Scenario: user enter valid credentials and login to gmail1

When User enter valid "soodpallavi1994@gmail.com" username 
And User enter valid "Quality@123" password
And User clicks on Login button 
Then User should be logged in dislaying logged in username in application 


@Regression @Smoke
Scenario: user enter valid credentials and login to gmail2

When User enter valid "soodpallavi1994@gmail.com" username 
And User enter valid "Quality@123" password
And User clicks on Login button 
Then User should be logged in dislaying logged in username in application 


@Smoke
Scenario: user enter valid credentials and login to gmail3

When User enter valid "soodpallavi1994@gmail.com" username 
And User enter valid "Quality@123" password
And User clicks on Login button 
Then User should be logged in dislaying logged in username in application 



Scenario: user enter valid credentials and login to gmail4

When User enter valid "soodpallavi1994@gmail.com" username 
And User enter valid "Quality@123" password
And User clicks on Login button 
Then User should be logged in dislaying logged in username in application 

