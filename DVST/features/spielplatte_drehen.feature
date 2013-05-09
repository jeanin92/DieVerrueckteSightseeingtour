# language: de

@spielzug_ausfuehren @spielplatte_drehen
Funktionalität: Spielplatte drehen
	Als Spieler
	Will ich die Spielplatte nach Belieben drehen
	So dass ich sie mir in die bestmögliche Position vor dem Einschieben drehen kann.
	
	Szenario: Der Spieler dreht die aktive Platte gar nicht.
		Angenommen das Spiel ist aktiv
		Und ich bin an der Reihe
		Wenn ich auf eine Spielplatte im Spielfeld klicke
		Dann kann ich die aktive Platte nicht mehr drehen.
	
	Szenariogrundriss: Der Spieler dreht die Karte um 90°.
		Angenommen das Spiel ist aktiv
		Und ich bin an der Reihe
		Wenn ich auf den Pfeil zum "<Drehrichtung>" klicke
		Dann wird die aktive Spielplatte um 90° nach "<Richtung>" gedreht
		Und ich kann die aktive Spielplatte weiter beliebig drehen, wenn ich will  
		
		Beispiele:
		| Drehrichtung	| Richtung	|
		| Linksdrehen	| links		|
		| Rechtsdrehen	| rechts	|