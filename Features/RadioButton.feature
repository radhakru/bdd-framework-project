Feature: Radio button Check in Elements page
Background:
Given user go to the url
Then click on Elements button

@one
Scenario: verify the radio button name present in Elements page
Then click on Radio Button button
Then verify the Radio Button text present in Elements Page

@two
Scenario: verify the yes radio button
Then click on Radio Button button
Then click on yes radio button
Then verify the yes text is present after you have selected

@three
Scenario: verify the impressive radio button
Then click on Radio Button button
Then click on impresive radio button
Then verify the impressive text is present after you have selected text 
