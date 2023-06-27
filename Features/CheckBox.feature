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

@tenth
Scenario: verify the Documents subtask
Then click on Check Box button
Then Expand the home box
Then Expand the Documents checkbox
Then verify the subtask present in documents

@eleventh
Scenario: verify the workspace subtask
Then click on Check Box button
Then Expand the home box 
Then Expand the Documents checkbox
Then Expand the Workspace checkbox
Then verify the subtask present in workspace

@twelveth
Scenario: verify the office subtask
Then click on Check Box button
Then Expand the home box
Then Expand the Documents checkbox
Then Expand the Office checkbox
Then verify the sub task present in office

@thirdteenth
Scenario: verify the react checkbox
Then click on Check Box button
Then Expand the home box
Then Expand the Documents checkbox
Then Expand the Workspace checkbox
Then click on react check box
Then verify the react check box is checked
Then verify the react check box name text show in report

@fourteenth
Scenario: verify the angular checkbox
Then click on Check Box button
Then Expand the home box
Then Expand the Documents checkbox
Then Expand the Workspace checkbox
Then click on angular check box
Then verify the angular check box is checked
Then verify the angular check box text present in report

@fiveteenth
Scenario: verify the veu checkbox
Then click on Check Box button
Then Expand the home box
Then Expand the Documents checkbox
Then Expand the Workspace checkbox
Then click on veu check box
Then verify the veu check box is checked
Then verify the veu check box text present in report

@sixteenth
Scenario: verify if all the subtask present in documnts are checked then documents checkbox is checked 
Then click on Check Box button
Then Expand the home box
Then Expand the Documents checkbox
Then Expand the Workspace checkbox
Then click on react check box
Then click on angular check box
Then click on veu check box
Then verify the workspace check box is checked
Then verify all the subtask and his parent check box name is present in report

@seventeenth
Scenario: verify if workspace checkbox is unchecked the all the subtasks are unchecked
Then click on Check Box button
Then Expand the home box
Then Expand the Documents checkbox
Then Expand the Workspace checkbox
Then verify the react check box is unchecked
Then verify the angular check box is unchecked
Then verify the veu check box is unchecked
Then verify the workspace check box is unchecked

@eightteenth
Scenario: verify the public check box
Then click on Check Box button
Then Expand the home box
Then Expand the Documents checkbox
Then Expand the Office checkbox 
Then click on public check box
Then verify the public check box is checked
Then verify the public check box name is present in report

@nineteenth
Scenario: verify the private check box
Then click on Check Box button
Then Expand the home box
Then Expand the Documents checkbox
Then Expand the Office checkbox
Then click on private check box
Then verify the private check box is checked
Then verify the private check box name is present in report

@twenty
Scenario: verify the classifired check box
Then click on Check Box button
Then Expand the home box
Then Expand the Documents checkbox
Then Expand the Office checkbox
Then click on classified check box
Then verify the classified check box is checked
Then verify the classified check box name is present in report 

@twentyone
Scenario: verify the genaral check box
Then click on Check Box button
Then Expand the home box
Then Expand the Documents checkbox
Then Expand the Office checkbox
Then click on general check box
Then verify the general check box is checked
Then verify the general check box text is present in report

@twentytwo
Scenario: verify if all the subtask present in office are checked then automatically office check box is checked
Then click on Check Box button
Then Expand the home box
Then Expand the Documents checkbox
Then Expand the Office checkbox
Then click on public check box
Then click on private check box
Then click on classified check box
Then click on general check box
Then verify the office check box is checked
Then verify the all the check box name are present in report

@twentythree
Scenario: verify if office check box is unchecked then all the subtask are unchecked
Then click on Check Box button
Then Expand the home box
Then Expand the Documents checkbox
Then Expand the Office checkbox
Then verify the public check box is unchecked
Then verify the private check box is unchecked
Then verify the classified check box is unchecked
Then verify the general check box is unchecked
Then verify the office check box is unchecked
 
@twentyfour
Scenario: verify if all the sub task present in the documents are checked then automatically documents is checked 
Then click on Check Box button
Then Expand the home box
Then Expand the Documents checkbox
Then click on Workspace checkbox
Then verify the workspace check box is checked
Then click on Office checkbox 
Then verify the office check box is checked
Then verify the documents check box is checked
Then verify the documents check box name is present in report 

@twentyfive
Scenario: verify if the documents check box is unchecked then automatically all the subtask are unchecked
Then click on Check Box button
Then Expand the home box
Then Expand the Documents checkbox
Then verify the documents check box is unchecked
Then verify the workspace check box is unchecked
Then verify the office check box is unchecked

@twentysix
Scenario: verify if one of the subtask is cheked from documents then documents check box is half checked
Then click on Check Box button
Then Expand the home box
Then Expand the Documents checkbox
Then click on Office checkbox
Then verify the doucments check box is half checked

@twentyseven
Scenario: verify downloads sub task 
Then click on Check Box button
Then Expand the home box
Then Expand the Downloads checkbox
Then verify all the sub task are present in downloads check box.

 
@twentyeight
Scenario: verify the wordfile check box
Then click on Check Box button
Then Expand the home box
Then Expand the Downloads checkbox
Then click on Word File.doc checkbox
Then verify the word file check box is checked
Then verify the word file check box is name present in report

@twentynine
Scenario: verify the excelFile check box
Then click on Check Box button
Then Expand the home box
Then Expand the Downloads checkbox
Then click on Excel file checkbox
Then verify the excel file check box is checked
Then verify the excel file checkbox name is present in report 

@thirty
Scenario: verify if one of the sub task is checked from downloads then automatically doewnlaod check box is half checked
Then click on Check Box button
Then Expand the home box
Then Expand the Downloads checkbox
Then click on Word File.doc checkbox
Then verify the word file check box is checked
Then verify the downloads check box is half checked

@thirtyone
Scenario: verify if all sub task present in downloads are checked then downloads status is checked. 
Then click on Check Box button
Then Expand the home box
Then Expand the Downloads checkbox
Then click on Word File.doc checkbox
Then click on Excel file checkbox
Then verify the word file check box is checked
Then verify the excel file check box is checked
Then verify the downloads check box is checked
Then verify all the checked box name is present in report 

@thirtytwo
Scenario: verify if downloads check box is unchecked then all sub task present in it is unchecked.
Then click on Check Box button
Then Expand the home box
Then Expand the Downloads checkbox
Then verify the downloads check box is unchecked
Then verify the word file check box is unchecked
Then verify the excel file check box is unchecked

@thirtythree
Scenario: verify if one of the sub task is checked from Desktops then desktop check box is Half checked
Then click on Check Box button
Then Expand the home box
Then Expand Desktop button
Then click on Note check box
Then Verify the Note check box is checked
Then verify Desktop check box is half checked

@thirtyfour
Scenario: verify if one of the sub task present in home check box is checked then home check box is half checked.
Then click on Check Box button
Then Expand the home box
Then click on Downloads checkbox
Then verify the downloads check box is checked
Then verify the home check box is half checked.

@thirtyfive
Scenario: verify if home checkbox is unchecked then all the sub task present in it is unchecked
Then click on Check Box button
Then Expand the home box
Then verify the desktop check box is unchecked
Then verify the documents check box is unchecked
Then verify the downloads check box is unchecked
Then verify the home check box is unchecked
 
@thirtysix
Scenario: verify if one of the sub task present in workspace is checked then workspace check box is half checked
Then click on Check Box button
Then Expand the home box
Then Expand the Documents checkbox
Then Expand the Workspace checkbox
Then click on angular check box
Then verify the workspace check box is half checked

@thirtyseven
Scenario: verify if one of the sub task present in office is checked then office check box is half checked 
Then click on Check Box button
Then Expand the home box
Then Expand the Documents checkbox
Then Expand the Office checkbox
Then click on public check box
Then verify the office check box is half checked

