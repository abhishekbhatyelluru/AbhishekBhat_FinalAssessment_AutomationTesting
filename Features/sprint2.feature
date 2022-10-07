
Feature: HRM Login Test Case

Scenario: Verify user is able to login with valid user id and
password

Given browser is open and application is in login page
When user enters user name and password
Then home page is displayed



Scenario: Apply the leave to Hrm

Given browser is open and application is in login page
When user enters user name and password
Then home page is displayed
Then apply on leave

Scenario: Method overloading

Given browser is open and application is in login page
When user enters user name and password
Then home page is displayed
Then search in admin by username
Then search in admin by username and empid
