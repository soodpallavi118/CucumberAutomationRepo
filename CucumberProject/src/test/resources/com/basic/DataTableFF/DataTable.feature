Feature: Login Functionality of Linkedin using table

Background: Common step to launch Linkedin page
Given User need to be on Linkedin Login page

Scenario: user enter valid credentials and login to gmail

When User enter valid username and password as below

|username                  | password    |
|soodpallavi1994@gmail.com | Quality@123 |
|soodpallavi118@gmail.com  | Mybruno@12  |

And User clicks on Login button 
Then User should be logged in dislaying logged in username in application 
And CloseBrowser


Scenario: user enter invalid credentials and login to gmail

When User enter invalid username 
And User enter valid "Quality@123" password
And User clicks on Login button 
Then User should not be logged in and error is displayed 
And CloseBrowser



