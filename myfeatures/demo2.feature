Feature: TestMeApp Validations
Background: Launch url

Scenario Outline: login for  TestMeApp
Given User enters username "<Uname>"
And the password "<pass>"
Then clicks on Sign
Then clicks on Allcategories 
Then clicks on Electronics
Then clicks on Headphone
Then clicks on Floor
Then clicks on add to cart Button
Then clicks on Remove Button
Then  enter login credentials
Examples:
| uname   |    pass    |
| Lalitha | password123|
| Lalitha | password123|
| Lalitha | password123|