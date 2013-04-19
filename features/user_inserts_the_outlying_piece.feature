#language:de
Funktionalität: der Benutzer schiebt die aktive Spielplatte ein
	Als Benutzer
	möchte ich die aktive Spielplatte in eine Reihe des Spielfeldes einschieben
	So dass ich einen Weg zu meinem Ausflugsziel finde.
	
	Szenario: der Benutzer schiebt die aktive Spielplatte ein und eine Spielfigur steht auf der rausgeschobenen Platte
		Angenommen es existiert ein laufendes Spiel
		Und ich bin an der Reihe
		Und ich besitze eine Spielkarte
    	Und die aktive Spielplatte befindet sich in der gewünschten Richtung		
		Wenn ich an der Stelle, wo ich die aktive Spielplatte einschieben will, auf den Pfeil klicke
		Dann wird die Spielplatte eingeschoben
		Und eine andere Spielplatte wird rausgeschoben 
		Und eine Figur befindet sich auf der rausgeschobenen Spielplatte
		Dann wird die Figur auf die eingefügte Spielplatte gesetzt
		Und ich sehe das aktualisierte Spielbrett
		
	Szenario: der Benutzer schiebt die aktive Spielplatte ein und es befindet sich keine Spielfigur auf der rausgeschobenen Platte
		Angenommen es existiert ein laufendes Spiel
		Und ich bin an der Reihe
		Und ich besitze eine Spielkarte
    	Und die aktive Spielplatte befindet sich in der gewünschten Richtung		
		Wenn ich an der Stelle, wo ich die aktive Spielplatte einschieben will, auf den Pfeil klicke
		Dann wird die Spielplatte eingeschoben
		Und eine andere Spielplatte wird rausgeschoben 
		Und es befindet sich keine Figur auf der rausgeschobenen Spielplatte
		Und ich sehe das aktualisierte Spielbrett