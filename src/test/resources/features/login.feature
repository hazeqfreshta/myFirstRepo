Feature: Login to Retail Website 

#Each feature file starts with feature keyword and name for feature file
#Each scenario starts with scenario keyword and : then name of the scenario
#Given is used for precondation
#When is used for an action 
#And is uded for actions step following when keyword 
#Then is used for expected result and writing assertions.
#Scenario runs once with provided data
#We use Examples keyword to store the data under it.
#We can write same step N times as long as they are the same (case sensitive, and no extra sp


@smokeTest  @Regression @endtoendTesting
Scenario: Retail website Login test
Given user is on Retail website
When user click on Myaccount
And user click on login option
And user enter userName 'eagles@tekschool.us' and password 'eagles'
And user click on login Button
Then user should be logged in to Myaccount dashboard


Scenario Outline: Retail website Login with multiple accounts

Given user is on Retail website
When user click on Myaccount
And user click on login option
And user enter userName '<userName>' and password '<password>'
And user click on login Button
Then user should be logged in to Myaccount dashboard

Examples:

|userName|password|
|eagles@tekschool.us|eagles|
|hawks@tekschool.us|hawks|
|falcons@tekschool.us|falcons|

