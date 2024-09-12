Feature: Login LeafTaps Application with vaild data

#common line for all the scenario
#Background:
#Given Launch the Browser and Load the Url 

@smoke @dilip @cucumber
Scenario: Login with Positive Value
When Enter the username as 'DemoCsr'
And Enter the passWord as 'crmsfa'
And Click on Login Button
Then Verfiy the login is Successful


@sanity @cucumber
Scenario: Login with Negative Value
When Enter the username as 'DemoSales'
And Enter the passWord as 'crmsfa'
And Click on Login Button
But Verfiy the login is not Successful

@cucumber @dilip
Scenario Outline: Create Lead with Multiple Data
#Given Launch the Browser and Load the Url 
When Enter the username as 'DemoCsr'
And Enter the passWord as 'crmsfa'
And Click on Login Button
Then Verfiy the login is Successful
When Click Crmsfa Button
And Click on Leads Button
And Click on CreateLead Button
And Enter the CompanyName as <companyName>
And Enter the FirstName as <firstName>
And Enter the LastName as <lastName>
And Click CreateLead Button
Then Verify Lead is Created

Examples:
|companyName|firstName|lastName|
|'TestLeaf'|'Dilip'|'Kumar'|
|'TestLeaf'|'Bhuvanesh'|'s'|