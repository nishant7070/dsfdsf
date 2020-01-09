Feature: DemoWebshop Validations

Scenario: Guest user registration in DemoWebshop
Given User launches the DemoWebshop App
Then user clicks on SignIn button
And User Provides the valid data for all the fields
When User clicks in submit button at the end of the form
Then verifies the result of the registration
And prints the message