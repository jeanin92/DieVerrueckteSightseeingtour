# language: de

@spielzug_ausfuehren
Funktionalität: Der Benutzer versucht sich ein neues Ziel zu nehmen.
	Als ein Benutzer
	Will ich eine neue Spielkarte ziehen, wenn ich an der Reihe bin und keine mehr habe
	So dass ich danach meinen Spielzug fortsetzen kann
	
	@karte_ziehen
	Szenario: Der Benutzer zieht eine neue Spielkarte, wenn er keine mehr hat.
		Angenommen ein Spiel ist aktiv
		Und ich bin an der Reihe
		Aber ich habe keine Spielkarte
		Wenn ich dem System mitteile, dass ich eine neue Spielkarte ziehen möchte
		Dann wird mir das neue Ziel mitgeteilt
		Und ich kann meinen Zug fortsetzen
		
	@karte_ziehen
	Szenario: Der Benutzer versucht die aktive Karte zu drehen, obwohl er keine Spielkarte hat.
		Angenommen ein Spiel ist aktiv
		Und ich bin an der Reihe
		Aber ich habe keine Spielkarte
		Wenn ich versuche, die aktive Karte zu drehen
		Dann sagt mir das System, dass ich erst eine Spielkarte ziehen muss
	
	@karte_ziehen	
	Szenario: Der Benutzer versucht die aktive Karte ins Spielfeld zu schieben, obwohl er keine Karte hat.
		Angenommen ein Spiel ist aktiv
		Und ich bin an der Reihe
		Aber ich habe keine Spielkarte
		Wenn ich versuche, die aktive Karte an einer markierten Stelle ins Spielbrett zu schieben
		Dann sagt mir das System, dass ich erst eine Spielkarte ziehen muss
		
	@karte_ziehen
	Szenario: Der Benutzer versucht seine Spielfigur zu bewegen, obwohl er keine Spielkarte hat.
		Angenommen ein Spiel ist aktiv
		Und ich bin an der Reihe
		Aber ich habe keine Spielkarte
		Wenn ich versuche, meine Spielfigur zu bewegen
		Dann sagt mir das System, dass ich erst eine Spielkarte ziehen muss
	
	@karte_ansehen	
	Szenario: Der Benutzer versucht eine Spielkarte zu ziehen, obwohl er eine hat.
		Angenommen ein Spiel ist aktiv
		Und ich bin an der Reihe
		Und ich habe eine Spielkarte
		Wenn ich versuche eine Spielkarte zu ziehen
		Dann sagt mir das System, dass ich bereits eine Spielkarte habe
		Und zeigt mir diese