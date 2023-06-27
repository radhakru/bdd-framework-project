Feature: verify the Buttons element present in elements

Background:
Given user go to the url
Then click on Elements button
@one
Scenario: verify the button text present in the elements page
Then click on Buttons button
Then verify the button text present in elements page
@two
Scenario: verify the double click button
Then click on Buttons button
Then clcik on Double click me button
Then verify the double click text in report
@Three
Scenario: verify the right click button
Then click on Buttons button
Then click on Right click button
Then verify the right click text in report
@Four
Scenario: verify the click me button
Then click on Buttons button
Then click on Click Me button
Then verify the click me text in report 
 