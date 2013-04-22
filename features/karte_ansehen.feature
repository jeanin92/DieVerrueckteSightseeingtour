#language: de

@spielzug_ausfuehren
Funktionalität: Der Benutzer kann sich sein Ziel ansehen, wenn er am Zug ist.	

	@karte_ansehen
	Szenario: Der Benutzer will seine Spielkarte ansehen, wenn er am Zug ist.
		Angenommen ein Spiel ist aktiv
		Und ich bin an der Reihe
		Und ich habe eine Spielkarte
		Wenn ich dem System sage, ich möchte die Spielkarte sehen
		Dann zeigt mir das System diese
		Und ich kann mit meinem Zug fortfahren.
		
	@karte_ziehen
	Szenario: Der Benutzer zieht eine neue Spielkarte, wenn er keine mehr hat, und zieht sich diese an.
		Als ein Benutzer
		Will ich eine neue Spielkarte bekommen, wenn ich an der Reihe bin und keine mehr habe
		So dass ich danach meinen Spielzug fortsetzen kann
	
		Angenommen ein Spiel ist aktiv
		Und ich bin an der Reihe
		Aber ich habe keine Spielkarte
		Und das System fragt mich, ob ich eine neue Spielkarte haben will
		Wenn ich zustimme
		Dann teilt mir das System das neue Ziel mit
		Und ich kann meinen Zug auf dem Spiel-Bildschirm fortsetzen