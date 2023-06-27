Feature: Test the Dynamic Properties

Background:
Given user go to the url
Then click on Elements button
@one
Scenario: verify the Dynamic Properties text
Then click on Dynamic Properties button
Then verify the dyanmic properties text present in Elements page.
@two
Scenario: verify the Visible After button 
Then click on Dynamic Properties button
Then verify the Visible After button is diaplayed