Feature: Elements Check
Background:
Given user go to the url
Then click on Elements button

Scenario: verify the Check box
Then click on Check Box button
Then verify the Check Box text in heading

Scenario: verify the Home check box in Check box
Then click on Check Box button
Then click on Home box button
Then verify the Home box report 

Scenario: check Expand and collapse button
Then click on Check Box button
Then click on Expand button
Then Verify the Expand button Expand all the elements
Then click on Collapse button
Then verify the collapse button collapse all the elements


Scenario: verify the subtask under home box
Then click on Check Box button
Then Expand the home box
Then you should see Three subtasks present in Home box
@fivth
Scenario: Check the Desktop subtask 
Then click on Check Box button
Then Expand the home box
Then Expand Desktop button
Then Verify the subtask present under Desktop.
@sixth
Scenario: verify the Note checkBox
Then click on Check Box button
Then Expand the home box
Then Expand Desktop button
Then click on Note check box
Then Verify the Note check box is checked
Then verify the Note box name present in report
@Seventh
Scenario: verify the Commands Box
Then click on Check Box button
Then Expand the home box
Then Expand Desktop button
Then click on Commands Check box
Then Verify the Commands Check box is checked 
Then Verify the Commands box name present in report. 

@eighth
Scenario: verify if both checkbox are check then Desktop checkbox is check
Then click on Check Box button
Then Expand the home box
Then Expand Desktop button
Then click on Note check box 
Then click on Commands Check box
Then verify Desktop Check box is checked
Then verify all the check box name present in report
@nineth
Scenario: verify if user uncheck the desktop check box then sub nodes automatically unchecked.
Then click on Check Box button
Then Expand the home box
Then Expand Desktop button
Then click on Desktop button for select all the sub nodes
Then Verify the Note check box is checked
Then Verify the Commands Check box is checked
Then verify all the check box name present in report
Then click on Desktop button for unselect all the sub nodes 
Then verify the Note check box is unchecked
Then verify the Commands check box is unchecked 
Then verify the report is empty








