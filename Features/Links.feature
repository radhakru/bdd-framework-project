Feature: Links feature working fine in Elements box 

Background:
Given user go to the url
Then click on Elements button 

@one
Scenario: verify the links text present in elements page
Then click on Links button
Then verify the link text present in the elements page

@two
Scenario: verify the home link open in new tab
Then click on Links button
Then click on Home link
Then verify the home link open another tab

@three
Scenario: verify the dynamic Home link open in new tab
Then click on Links button
Then click on dynamic Home link
Then verify the dynamic home link open in new tab
 
@four
Scenario: vreify created link respond with which number status 
Then click on Links button
Then click on created link
Then verify the created link status 

@five
Scenario: verify no content link respond with which number status
Then click on Links button
Then click on no contant link
Then verify the no content link status 

@six
Scenario: verify moved link respond with which number status
Then click on Links button
Then click on Moved linked
Then verify the moved link status

@seven
Scenario: verify Bad Request link respond with which number status
Then click on Links button
Then click on Bad Request link 
Then verify the bad request link status

@eight
Scenario: verify unauthorized link respond with which number status
Then click on Links button
Then click on unauthorized link
Then verify the unauthorized link status

@nine 
Scenario: verify the forbidden link repond which number status
Then click on Links button
Then click on Forbidden link
Then verify the forbidden link status

@ten
Scenario: verify not found link respond which number status
Then click on Links button
Then click on Not Found link
Then verify the not found link status



  
 