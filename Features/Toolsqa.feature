Feature: Element box check

Background:
Given user go to the url
Then click on Elements button

@Fourth
Scenario: TextBox Testing
Then click on Textbox
Then Enter his/her fullname
Then Enter his/her Emailid
Then Enter his/her Current address
Then Enter his/her permanent address
Then clcik on submit button
@Fiveth
Scenario: Verify TestBox Report
Then click on Textbox
Then Enter his/her fullname
Then Enter his/her Emailid
Then Enter his/her Current address
Then Enter his/her permanent address
Then clcik on submit button
Then verify the fullName as same as report name
Then verify the Emaild as same as report eamilid  
Then verify the Current address as same as in report current address field
Then verify the permanent address as same as in reoprt permanent address field



@Smoke
Scenario: Check the full name only  

Then click on Textbox
Then Enter your fullname
Then clcik on submit button
Then verify the fullname as same as report name
@Smoke
Scenario: verify the EmailId 

Then click on Textbox
Then Enter your EmailId
Then clcik on submit button
Then verify the EmailId as sama as report name

@Smoke
Scenario: verify the Current Address 

Then click on Textbox
Then Enter your Current Address
Then clcik on submit button 
Then verify the Current Address as same as report Current Address
@Smoke
Scenario: verify the Permanent Address

Then click on Textbox
Then Enter your Permanent Address
Then clcik on submit button
Then verify the Permanent Address as same as report Permanent Address

@Second
Scenario: verify the Elements Text

Then Verify the Elements Text should show in Webpage. 

@Third
Scenario: verify the TextBox Text

Then click on Textbox
Then verify the TextBox Text should show in webpage
@First
Scenario: verify ToolsQA Text 

Then verify the ToolsQA Test should show in webapage

@Regression
Scenario: verify fullname with only numbers

Then click on Textbox
Then Enter only number in the Fullname field
Then click on submit button
Then verify the fullname in report 

@SmokeTest
Scenario: verify Current Address with only numbers

Then click on Textbox 
Then Enter only number in current address field
Then click on submit button
Then verify the Current address in report
@SmokeTest
Scenario: verify Current Address with only Special charecter

Then click on Textbox
Then Enter only special charecter in currenta address field
Then click on submit button
Then verify the Current Address 
@SmokeTest
Scenario: verify Current Address with charecterandnumber

Then click on Textbox
Then Enter both charecter and numbers in currect address field 
Then click on submit button
Then verify current address field
@SmokeTest
Scenario: verify current Address with number and charecter

Then click on Textbox
Then Enter both number and charecter in current address field
Then click on submit button
Then verify current address field in report
@SmokeTest
Scenario: verify permanent Address with only numbers

Then click on Textbox
Then Enter only number in permanent address
Then click on submit button
Then verify permanent address with only number
@SmokeTest
Scenario: verify permanent Address with both charecter and number

Then click on Textbox
Then Enter both charecter and number in permanent address field
Then click on submit button 
Then verify permanent address with charecter and number
@SmokeTest
Scenario: verify permanet Address with both number and charecter

Then click on Textbox
Then Enter both number and charecter in permanent address field
Then click on submit button
Then verify permanent address with both number and charecter
@SmokeTest
Scenario: verify permanent address with only special charecter

Then click on Textbox
Then Enter only Special charecter in permanent address field
Then click on submit button
Then verify permenent address with special charecter



 
