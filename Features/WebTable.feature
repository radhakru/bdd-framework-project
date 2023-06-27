Feature: Verify Web Table page present in Elements

Background:
Given user go to the url
Then click on Elements button

@one
Scenario: verify the Web Table text show in Elements page
Then click on Web Table button
Then verify the web table text present in Elements page

@two
Scenario: Add someone to table
Then click on Web Table button
Then click on Add button
Then Enter First name
Then Enter Last name
Then Enter Email id
Then Enter Age
Then Enter Salary
Then Enter Department
Then click on sumbit
Then verify his/her First name present in First name  column
Then verify his/her Last name present in last name column
Then verify his/her Email id  present in Email id column
Then verify his/her Age present in Age column
Then verify his/her Salary present in salary column
Then verify his/her Department name presnt in Department column.

@Three
Scenario: Search some one name in the Table
Then click on Web Table button
Then click on Add button
Then Enter First name
Then Enter Last name
Then Enter Email id
Then Enter Age
Then Enter Salary
Then Enter Department
Then click on sumbit
Then enter first first three later of someones name
Then verify your searching name is present in table names

@Four
Scenario: customize the row in table
Then click on Web Table button
Then select the rows from row button
Then verify the number of rows in table is same as you selected rows

@Five
Scenario Outline: select page from pages
Then click on Web Table button
Then click on Add button
Then fill the fullname "<FirstName>"
Then fill the lastname "<LastName>"
Then fill the email "<Email>"
Then fill the age "<Age>"
Then fill the salary "<Salary>"
Then fill the department "<Department>"
Then click on sumbit
Then click on Add button
Then fill the fullname "<FirstName>"
Then fill the lastname "<LastName>"
Then fill the email "<Email>"
Then fill the age "<Age>"
Then fill the salary "<Salary>"
Then fill the department "<Department>"
Then click on sumbit
Then click on Add button
Then fill the fullname "<FirstName>"
Then fill the lastname "<LastName>"
Then fill the email "<Email>"
Then fill the age "<Age>"
Then fill the salary "<Salary>"
Then fill the department "<Department>"
Then click on sumbit
Then click on Add button
Then fill the fullname "<FirstName>"
Then fill the lastname "<LastName>"
Then fill the email "<Email>"
Then fill the age "<Age>"
Then fill the salary "<Salary>"
Then fill the department "<Department>"
Then click on sumbit
Then click on Add button
Then fill the fullname "<FirstName>"
Then fill the lastname "<LastName>"
Then fill the email "<Email>"
Then fill the age "<Age>"
Then fill the salary "<Salary>"
Then fill the department "<Department>"
Then click on sumbit
Then click on Add button
Then fill the fullname "<FirstName>"
Then fill the lastname "<LastName>"
Then fill the email "<Email>"
Then fill the age "<Age>"
Then fill the salary "<Salary>"
Then fill the department "<Department>"
Then click on sumbit
Then click on Add button
Then fill the fullname "<FirstName>"
Then fill the lastname "<LastName>"
Then fill the email "<Email>"
Then fill the age "<Age>"
Then fill the salary "<Salary>"
Then fill the department "<Department>"
Then click on sumbit
Then click on Add button
Then fill the fullname "<FirstName>"
Then fill the lastname "<LastName>"
Then fill the email "<Email>"
Then fill the age "<Age>"
Then fill the salary "<Salary>"
Then fill the department "<Department>"
Then click on sumbit
Then click on Add button
Then fill the fullname "<FirstName>"
Then fill the lastname "<LastName>"
Then fill the email "<Email>"
Then fill the age "<Age>"
Then fill the salary "<Salary>"
Then fill the department "<Department>"
Then click on sumbit
Then click on Add button
Then fill the fullname "<FirstName>"
Then fill the lastname "<LastName>"
Then fill the email "<Email>"
Then fill the age "<Age>"
Then fill the salary "<Salary>"
Then fill the department "<Department>"
Then click on sumbit
Then verify the page number
Then go to the next page through enter the page number

Examples:
|FirstName|LastName|Email|Age|Salary|Department|
|Radhakrushna|Satapathy|H@gmail.com|24|40000|software|



@six
Scenario: verify edit box is working fine
Then click on Web Table button
Then enter search name in search box
Then click on edit button
Then edit the name 
Then click on sumbit
Then verify edit name present in table

@seven
Scenario: verify the delete button
Then click on Web Table button
Then enter search name in search box
Then click on delete button
Then verify delete name do not present in table








   