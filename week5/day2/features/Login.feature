Feature: Login LeafTaps Application with vaild data

Scenario: Login with Positive Value
Given Launch the Browser and Load the Url 
When Enter the username as 'DemoSalesManager'
And Enter the passWord as 'crmsfa'
And Click on Login Button
Then Verfiy the login is Successful


Scenario: Login with Negative Value
Given Launch the Browser and Load the Url 
When Enter the username as 'DemoSales'
And Enter the passWord as 'crmsfa'
And Click on Login Button
But Verfiy the login is not Successful