Feature: Test Tagged Hooks 

@First 
Scenario: This is first test
	Given user is already on Login Page 
	When title of login page is Free CRM 
	Then user enters username and password
		| username | password|
		| naveenk | test@123 |
		
	Then user clicks on login button 
	Then user is on home page 
	Then user moves to new deal page 
	Then user enters deal details 
		|title       | amount | probability | commission |
		| test deal1 | 1000 | 50 | 10 |
		| test deal2 | 2000 | 60 | 20 |
		| test deal3 | 3000 | 70 | 30 |
		
	Then Close the browser
	
@Second 
Scenario: This is second test
Given user is already on Login Page 
	When title of login page is Free CRM 
	Then user enters username and password
		| username | password|
		| naveenk12 | test@123 |
		
	Then user clicks on login button 
	Then user is on home page 
	Then Close the browser	
	
	
@Third 
Scenario: This is third test
Given user is already on Login Page 
	When title of login page is Free CRM 
	Then user enters username and password
		| username | password|
		| naveenk | test@123 |
		
	Then user clicks on login button 
	Then user is on home page 
	Then Close the browser
		