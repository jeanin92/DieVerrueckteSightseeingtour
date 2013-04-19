Feature: User inserts the outlying piece
	As a user
	I want to insert the outlying piece into a row of the board
	So that I can find a way to my destination.

#	As part of his move in the game the user has to insert the outlying piece
#   into a row of the board to find a way to his destination.
#	This only happens if a destination is assigned to the user
#   and it always happens before the user makes a move.
	
	Scenario: User inserts the outlying piece
		Given there is an active game
		And it is my turn
		And I have a card
		And I was able to rotate the piece
		When I click the arrow where I want to insert the outlying piece
		Then the piece will be inserted
		And another piece will be discarded 
		And if a pawn is located on the discarded piece it will be relocated on the inserted piece
		And I see the updated board
		And I can move