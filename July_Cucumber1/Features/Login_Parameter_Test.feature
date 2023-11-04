@end2end
Feature: Loin into Browserstack
 Description: I want to use this template for my login into browserstack portal file 

	Background:

		Given I am on Browserstack home page
    When I am click on login button
  	Then I navigate to Login In page
  	
  	@sanity
  Scenario: successful login into browserstack
    
    When I enter  username as "uddhavhivare@gmial.com"
    And  I enter password as "Uddhav@123"
    And I click on the Login button
    Then user navigate  to Dashboard page
    And user display browserstack dashboard
  # When I want to close the  Test
  # Then Browser closed
    @sainty
    Scenario: successful login into browserstack 
    
    When I enter  username as "info@utkarshaaacademy.com"
    And  I enter password as "gujar1311"
    And I click on the Login button
    Then user navigate  to Dashboard page
    And user display browserstack dashboard
  # When I want to close the  Test
  # Then Browser closed