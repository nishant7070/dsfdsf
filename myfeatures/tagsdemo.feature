Feature: my demo on tags
@smoke @regression
Scenario: Registration in amazon
Given I launch app
Then I register with the valid data
@smoke
Scenario: Login in amazon
Given application is working
And I provide valid data
@regression
Scenario:ordering the amazon
Given I am placing order for my selected item
@uat @smoke
Scenario: cancellation in amazon
Given I cancel the order as it is not meets my expectation 