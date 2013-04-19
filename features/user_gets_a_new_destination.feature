# language: de
Funktionalität: User gets a new destination
	Als ein Benutzer
	Will ich eine neue Spielkarte ziehen, wenn ich an der Reihe bin und keine mehr habe
	So dass ich danach meinen Spielzug fortsetzen kann
	
	Szenario: Der Benutzer zieht eine neue Spielkarte, wenn er keine mehr hat
		Angenommen ein Spiel ist aktiv
		Und ich bin an der Reihe
		Und ich habe keine Spielkarte
		Und das Popup zum Karte ziehen ist geöffnet
		Wenn ich den Ziehen-Button klicke
		Dann wird eine Spielkarte ausgewählt
		Und das neue Ziel wird mir mitgeteilt
		Und ich klicke den Gemerkt-Button an
		Und das Popup schließt sich
		Und ich befinde mich wieder auf dem Spiel-Bildschirm
		Und ich bin immer noch an der Reihe