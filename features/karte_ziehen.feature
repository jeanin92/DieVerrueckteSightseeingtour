# language: de

@spielzug_ausfuehren @karte_ziehen
Funktionalität: Der Benutzer zieht ein neues Ziel und sieht sich dieses an.
	Als ein Benutzer
	Will ich eine neue Spielkarte bekommen, wenn ich an der Reihe bin und keine mehr habe
	So dass ich danach meinen Spielzug fortsetzen kann
	
	Szenario: Der Benutzer zieht eine neue Spielkarte, wenn er keine mehr hat.
		Angenommen ein Spiel ist aktiv
		Und ich bin an der Reihe
		Aber ich habe keine Spielkarte
		Und das System fragt mich, ob ich eine neue Spielkarte haben will
		Wenn ich zustimme
		Dann teilt mir das System das neue Ziel mit
		Und ich kann meinen Zug auf dem Spiel-Bildschirm fortsetzen