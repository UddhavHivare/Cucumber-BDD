@end2end
Feature: Loin into Browserstack
 Description: I want to use this template for my login into browserstack portal file 

	Background:

		Given I am on Browserstack home page
    When I am click on login button
  	Then I navigate to Login In page
  	
  	@sanity
  Scenario Outline: successful login into browserstack
    When I enter  username as "<username>"
    And  I enter password as "<password>"
    And I click on the Login button
    Then user navigate  to Dashboard page
    And user display browserstack dashboard
  Examples:
| username								|	password	|
| uddhavhivare@gmail.com 	|Uddhav@123	|
|info@utkarshaaacademy.com|gujar1311	|

 	@regression
  Scenario Outline: usuccessful login into browserstack
    When I enter  username as "<Iusername>"
    And  I enter password as "<Ipassword>"
    And I click on the Login button
    But The user credentials are wrong
    Then user display error message as please enter vaild username password
  Examples:
| Iusername									|	Ipassword	|
| uddhavhivare@gmail.com 	|Uddhav@1323	|
|info@utkarshaaacademy.com	|gujar21311	|