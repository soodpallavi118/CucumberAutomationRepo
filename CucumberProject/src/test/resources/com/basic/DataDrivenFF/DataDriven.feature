Feature: Login Functionality of Linkedin using DataDriven 

Background: Common step to launch Linkedin page
Given User need to be on Linkedin Login page

Scenario Outline: user enter valid credentials and login to gmail

When User enter valid "<user>" username 
And User enter valid "<password>" password
And User clicks on Login button 
Then User should be logged in dislaying logged in username in application 
And CloseBrowser
Examples:
|user                      | password    |
|soodpallavi1994@gmail.com | Quality@123 |
|soodpallavi118@gmail.com  | Mybruno@12  |






