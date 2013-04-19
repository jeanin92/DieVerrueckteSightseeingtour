Feature: User uses the manual
	As a user
	I want read the manual and then continue to the game
	So that I know how to play
	
	Scenario: User opens the manual before the game starts
		Given I have started the app
		And I am on the start screen
		When I click the manual button
		Then the manual screen opens
		And I must scroll down
		And I click the continue button
		And the game mode screen opens
		
	Scenario: User opens the manual when it is his turn during the game
		Given a game is in progress
		And the game screen is open
		And it is my turn
		When I click the manual button
		Then the manual screen opens
		And I must scroll down
		And I click the continue button
		And I go back to the game screen
		