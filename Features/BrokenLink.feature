Feature: BrokenLink in Elements page

Background:
Given user go to the url
Then click on Elements button
@one
Scenario: verify the broken link text present in Elements page
Then click on Broken Link Image button
Then verify the broken link text present in elements page
@two
Scenario: verify the status code of broken link
Then click on Broken Link Image button
Then verify the status code of broken link
@three
Scenario: verify the image is broken image
Then click on Broken Link Image button
Then verify the broken image is broken image
 
 

 