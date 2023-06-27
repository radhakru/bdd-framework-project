Feature: Testing the Form Feature

Background:
Given user go to the url

Scenario: verify the Forms name displayed or not
Then click on Forms button
Then verify the forms text displayed.
@two
Scenario: verify the Praticeform text present in Forms page
Then click on Forms button
Then click on Practice Form
Then verify the practice form text present in forms page

@three
Scenario Outline: validate the Form 
Then click on Forms button
Then click on Practice Form
Then Enter Firstname "<Fullname>"
Then Enter Lastname "<Lastname>"
Then Enter emial id "<emailid>"
Then select gender
Then Enter mobile number "<Mobile number>"
Then Enter Date of Birth
Then Enter Subject
Then select Hobbies check box
Then updoad files
Then Enter Current Address "<Current Address>"
#Then Enter state 
#Then Enter city
#Then click on submit Button

Examples:
|Fullname|Lastname|emailid|Mobile number|Current Address|
|Gulu|sata|r@gmail.com|7609962010|Bhubaneswar|
|Babu|sata|g@gamil.com|9875532560|Bhubaneswar|
|Lalu|sata|v@gmail.com|6789098764|Bhubaneswar|


#@Four
#Scenario: Verify the form
#Then click on Forms button
#Then click on Practice Form
#Then Enter all the blank fill
#|Firstname|Lastname|emailid|Mobile number|Current Address|
#|Gulu|sata|r@gmail.com|7609962010|Bhubaneswar|
#|Babu|sata|g@gamil.com|9875532560|Nayapali|
#|Lalu|sata|v@gmail.com|6789098764|Bangalore|




