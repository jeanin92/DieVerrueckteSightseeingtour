# language: de
Funktionalität: User gets a new destination
	As a user
	I want to draw a new destination when it's my turn in the game
	So that I can continue my turn.
	
	Szenario: User draws a new destination card when he has none
		Angenommen there is an active game
		Und it is my turn
		Und I have no card
		Und the draw popup opens
		Wenn I click the draw button
		Dann a card is selected
		Und I see an image of my new destination
		Und I click the memorized button
		Und the draw popup closes
		Und I am back at the my_turn screen