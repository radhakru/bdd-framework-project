Feature: Testing of AlertFrameandWindows feature

Background:
Given user go to the url

@one
Scenario: verify the alert,Frames and Windows page
Then click on Alertframeandwindows button
Then verify the Alertframewindows text 

@two
Scenario: verify the Browser Windows
Then click on Alertframeandwindows button
Then click on Browser Windows
Then verify the Browser Windows text 

@three
Scenario: verify the New tab button
Then click on Alertframeandwindows button
Then click on Browser Windows
Then click on New Tab
Then see next window open sucessfully

@four
Scenario: verify the New Window
Then click on Alertframeandwindows button
Then click on Browser Windows
Then click on New Window button
Then see next window open sucessfully 

@five
Scenario: verify the new windows message
Then click on Alertframeandwindows button
Then click on Browser Windows
Then click on New Windows message
Then see next window open with some text

@six
Scenario: verify the alerts 
Then click on Alertframeandwindows button
Then click on Alerts text
Then verify the alert text present in page
Then click on click button to see alert
Then click on accept alert
Then click on alert will appear after five seconds
Then click on accept alert 
Then click on comfirm box alert button
Then click on accept alert 
Then verify the alert of confirm text
Then click on prompt box alert button
Then enter the alert text
Then click on accept alert
Then verify the prompted text


@seven
Scenario: verify the iframe text
Then click on Alertframeandwindows button
Then click on iframe button
Then verify iframe text


@eight
Scenario: verify the mini iframe text
Then click on Alertframeandwindows button
Then click on iframe button
Then verify mini iframe text
 





 

