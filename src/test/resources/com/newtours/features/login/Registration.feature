@Smoke 
Feature: register a user succesfully 
	As a user I should be able to register a user 

Scenario Outline: register a user 
	Given I am on demoqa home page 
	When I click on registration 
	Then I should be on registration page 
	And I register user with fname as "<firstName>" lname as "<lastName>" country as "<country>"
	
	Examples: 
		|firstName|lastName|country|
		|Adam|Pokanbee|France|
		
		
		
		
		
		
