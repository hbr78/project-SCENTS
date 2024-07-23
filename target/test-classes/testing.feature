Feature: The user enters the testing site
@one
Scenario: To Verify AREAS OF SCENTING
Given To launch the browser 
When To launch the url of SCENT application
And Clickthe AboutUs button
And Verify Descriptions To click hotel button
And To click offices button
And To click Ariports
And To click Retail
Then close the browser1

@second
Scenario: Navigate to Contact Us from Our Services
Given To launch the browser2 
When To launch the URL of SCENT application
And To click the our services button
And To Click the Contact button
Then Close the Browser2


@Three
Scenario: To Verify Contact Us Page Functionality
Given To launch the browser3 
When To launch the url of SCENT dApplication
And To Click the Contact us button
And send text to Full name box 
And send text to  company name box
And send text to phone number box
And Send text to Email address box
And To click the what type of services
And To select want to buy products
And Send text to where are you located box
And Send text to message box
And To click the send button
Then close the browsers3

