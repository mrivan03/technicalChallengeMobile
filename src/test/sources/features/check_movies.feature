Feature: Check movies 
	I as a movie buff I want to check the list of movies and register it

Scenario: 
	Register the consultation of opera, ballet and theater films in billboard 

	Given I want to check opera, ballet and theater movies 
	When I check opera movies 
		|Movie Type|
		|Opera     |
	And I check ballet movies 
		|Movie Type|
		|Ballet    |
	And I check theater movies 
		|Movie Type|
		|Theater   |
	Then Successful registration