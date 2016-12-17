Feature: login with invalid credentials
As a user i should not be able to login with invalid credentials

Scenario Outline: 

	Given I am on Mercury home page
	When I enter invalid "<username>" and invalid "<password>"
	Then I should be able to see "Welcome back to Mercury Tours!" message
	
	Examples:
	
		|username|password|
		|shak	 |345345	  |
		|alex	 |234234	  |
		|toto	 |2354t2  |
	
