@end2end
Feature: Loin into Browserstack
 Description: I want to use this template for my login into browserstack portal file 

	Background:

		Given I am on Browserstack home page
    When I am click on login button
  	Then I navigate to Login In page
  	
  	@sanity
  Scenario: successful login into browserstack
    
    When I enter  username as uddhavhivare@gmial.com
    And  I enter password as Uddhav@123
    And I click on the Login button
    Then user navigate  to Dashboard page
    And user display browserstack dashboard
    #Then Browser get closed
   
     @regression
    Scenario: unsuccessful login into browserstack
     
    When I enter  username as uddhavhivare1@gmial.com
    And  I enter password as Uddhav@1234
    And I click on the Login button
    But The user credentials are wrong
    Then user display error message as please enter vaild username password
   
