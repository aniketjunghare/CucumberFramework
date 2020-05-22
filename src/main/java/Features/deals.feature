Feature: Deal data creation

Scenario: Create a new deal scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters username1 and password1
| naveenk | test@123 |

Then user clicks on login button
Then user is on home page
Then user moves to deal page
Then user enters deal1 details
| test deal | 1000 | 50 | 10 |

Then Close the browser