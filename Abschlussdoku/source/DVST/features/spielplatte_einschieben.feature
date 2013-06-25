#language: de

@spielzug_ausfuehren @spielplatte_einschieben
Funktionalität: Der Benutzer schiebt die aktive Spielplatte ein.
	Als Benutzer
	moechte ich die aktive Spielplatte in eine Reihe des Spielfeldes einschieben
	So dass ich einen Weg zu meinem Ausflugsziel finde.
	
	Grundlage:
	Angenommen es existiert ein laufendes Spiel
	Und ich bin an der Reihe
	Und ich besitze eine Spielkarte
    Und die aktive Spielplatte befindet sich in der gewuenschten Richtung	
	
	Szenario: der Benutzer schiebt die aktive Spielplatte ein und eine Spielfigur steht auf der rausgeschobenen Platte
		Wenn ich an der Stelle, an der ich die aktive Spielplatte einschieben will, auf den Pfeil klicke
		Dann wird die Spielplatte eingeschoben
		Und eine andere Spielplatte wird rausgeschoben 
		Wenn sich eine Figur auf der rausgeschobenen Spielplatte befindet
		Dann wird die Figur auf die eingefuegte Spielplatte gesetzt
		Und ich sehe das aktualisierte Spielbrett
		
	Szenario: der Benutzer schiebt die aktive Spielplatte ein und es befindet sich keine Spielfigur auf der rausgeschobenen Platte		
		Wenn ich an der Stelle, an der ich die aktive Spielplatte einschieben will, auf den Pfeil klicke
		Dann wird die Spielplatte eingeschoben
		Und eine andere Spielplatte wird rausgeschoben 
		Wenn sich keine Figur auf der rausgeschobenen Spielplatte befindet
		Dann sehe ich das aktualisierte Spielbrett