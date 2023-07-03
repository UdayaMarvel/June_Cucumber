@todaydeals
Feature: Amazon Todays Deals

Background: Common Function
Given launch the browser with url "https://www.amazon.com"

@smoke @sanity @regress 
Scenario: Todays Deals
When user signing in with one dim map
|user1|udayamarvel@gmail.com|
|user2|udaya@gmail.com|
|user3|marvel@gmail.com|
And user enter the mail id
When user clicks on todays deals
Then validate the products displayed with percentage
When user clicks on product
Then validate the related product displayed
Then validate the related product displayed
Then validate

@smoke
Scenario: Todays Deals
When user signing in with one dim map
|user1|udayamarvel@gmail.com|
|user2|udaya@gmail.com|
|user3|marvel@gmail.com|
And user enter the mail id
When user clicks on todays deals
Then validate the products displayed with percentage
When user clicks on product
Then validate the related product displayed
Then validate the related product displayed
Then validate

@sanity @smoke
Scenario: Todays Deals
When user signing in with one dim map
|user1|udayamarvel@gmail.com|
|user2|udaya@gmail.com|
|user3|marvel@gmail.com|
And user enter the mail id
When user clicks on todays deals
Then validate the products displayed with percentage
When user clicks on product
Then validate the related product displayed
Then validate the related product displayed
Then validate


@sanity
Scenario Outline: Todays deals with multiple username
When user signing in "<username>"
And user enter the mail id 
When user clicks on todays deals
Then validate the products displayed with percentage
When user clicks on product
Examples:
|username|
|udayamarvel@gmail.com|
|udaya@gmail.com|
|marvel@gmail.com|