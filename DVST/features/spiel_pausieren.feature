# language: de

@spiel_pausieren
Funktionalität: Spiel pausieren und Spielstand merken
	Als Benutzer, der das Spiel gestartet hat
	Will ich das laufende Spiel unterbrechen können ohne den Spielstand zu verlieren
	So dass ich angefangenes Spiel weiterspielen kann, nachdem ich es unterbrochen habe.
	
	Szenario: Der Benutzer pausiert das laufende Spiel,in dem er die App schließt und diese im Hintergrund weiterläuft.
		Angenommen ein Spiel ist aktiv
		Wenn ich die App verlasse (nicht beenden)
		Dann wird die App im momentanen Zustand mit allen Fortschritten eingefroren
		Und kann zu jedem Zeitpunkt an dieser Stelle weitergespielt werden.