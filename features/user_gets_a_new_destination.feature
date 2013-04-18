Feature: User gets a new destination
	As a user
	I want to draw a new destination
	So that I know how to continue my turn.

#	As part of his move in the game the user has to draw a card
#	to know which destination to go to next. This only happens at the
#	beginning of the game or if the user has reached his last destination
#	in the previous round.
	
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