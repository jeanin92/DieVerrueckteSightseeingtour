# language: de

@spielzug_ausfuehren @karte_ansehen
Funktionalität: Der Benutzer sieht sich sein Ziel an, wenn er am Zug ist.	

	Szenario: Der Benutzer will seine Spielkarte ansehen, wenn er am Zug ist.
		Angenommen ein Spiel ist aktiv
		Und ich bin an der Reihe
		Und ich habe eine Spielkarte
		Wenn ich dem System sage, ich möchte die Spielkarte sehen
		Dann zeigt mir das System diese
		Und ich kann mit meinem Zug fortfahren.