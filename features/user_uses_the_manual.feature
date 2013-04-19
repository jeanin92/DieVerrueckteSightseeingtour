# language: de
Funktionalität: Benutzer verwendet die Spielanleitung
	As a user
	I want read the manual and then continue to the game
	So that I know how to play
	
	Szenario: User opens the manual before the game starts
		Angenommen I have started the app
		Und I am on the start screen
		Wenn I click the manual button
		Dann the manual screen opens
		Und I must scroll down
		Und I click the continue button
		Und the game mode screen opens
		
	Szenario: User opens the manual when it is his turn during the game
		Angenommen a game is in progress
		Und the game screen is open
		Und it is my turn
		Wenn I click the manual button
		Dann the manual screen opens
		Und I must scroll down
		Und I click the continue button
		Und I go back to the game screen
		