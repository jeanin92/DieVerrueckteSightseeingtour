Feature: User uses the manual
	After starting the android app, the user may choose to read the manual
	before continuing to the game, so he knows the rules.
	During the game the user may choose to read the manual when it is his turn
	before returning to the running game.
	
	Scenario: User opens the manual before the game starts
		Given I have started the app
		And I am on the start screen
		When I click the manual button
		Then the manual screen opens
		And I must scroll down
		And I click the continue button
		And the game mode 
		
	Scenario: User opens the manual during the game
		Given a game has started
		And it is my turn
		When I click the manual button
		Then the manual screen opens
		And I must scroll down
		And I click the continue button