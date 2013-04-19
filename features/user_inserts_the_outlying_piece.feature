Feature: User inserts the outlying piece
	As a user
	I want to insert the outlying piece into a row of the board
	So that I can find a way to my destination.
	
	Scenario: User inserts the outlying piece and a pawn is located on the discarded piece
		Given there is an active game
		And it is my turn
		And I have a card
		And I was able to rotate the piece
		When I click the arrow where I want to insert the outlying piece
		Then the piece will be inserted
		And another piece will be discarded 
		And a pawn is located to it
		Then the pawn will be relocated to the inserted piece
		And I see the updated board
		And I can move my pawn
		
	Scenario: User inserts the outlying piece and no pawn is located on the discarded piece
		Given there is an active game
		And it is my turn
		And I have a card
		And I was able to rotate the piece
		When I click the arrow where I want to insert the outlying piece
		Then the piece will be inserted
		And another piece will be discarded
		And no pawn is located to it
		And I see the updated board
		And I can move my pawn