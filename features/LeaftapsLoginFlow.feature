Feature: Leaftaps UI login flow

Background:
Given Chrome browser is opened
And Load the application URL as "http://leaftaps.com/opentaps/"
And Maximize and set the timeouts

#Scenario: TC001 - Login with valid credentials
#Given Enter username as "Demosalesmanager"
#And Enter password as "crmsfa"
#When Login Button is clicked
#Then Home Page should be displayed
#
#Scenario: TC002 - Login with invalid credentials
#Given Enter username as "DemoSalesManager"
#And Enter password as "Test@123"
#When Login Button is clicked
#But Error message should be displayed

Scenario Outline: TC003 - Login with multiple credentials
Given Enter username as <username>
And Enter password as <password>
When Login Button is clicked
But Error message should be displayed
Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|
