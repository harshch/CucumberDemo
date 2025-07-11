Feature: Login
	Scenario: Valid login
	Given User is on login page
	When user enters username as "standard_user" and password as "secret_sauce"
	And user clicks on login button
	Then Products label gets displayed 