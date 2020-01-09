Feature: DemoWebshop Validations

Scenario: Guest user registration in DemoWebshop
Given User launches the DemoWebshop App
Then user clicks on SignIn button
And User Provides the valid data for all the fields
When User clicks in submit button at the end of the form
Then verifies the result of the registration 
And prints the message

Scenario: Registered user login in DemoWebshop
Given Application launched by registered user
Then User access the Login Link
And Provides the valid data as input
And verifies the login status
