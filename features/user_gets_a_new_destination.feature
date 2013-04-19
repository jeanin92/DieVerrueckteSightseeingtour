Feature: User gets a new destination
	As a user
	I want to draw a new destination when it's my turn in the game
	So that I can continue my turn.
	
	Scenario: User draws a new destination card when he has none
		Given there is an active game
		And it is my turn
		And I have no card
		And the draw popup opens
		When I click the draw button
		Then a card is selected
		And I see an image of my new destination
		And I click the memorized button
		And the draw popup closes
		And I am back at the my_turn screen