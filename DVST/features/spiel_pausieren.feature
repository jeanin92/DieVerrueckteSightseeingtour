# language: de

@spiel_pausieren
Funktionalit�t: Spiel pausieren und Spielstand merken
	Als Benutzer, der das Spiel gestartet hat
	Will ich das laufende Spiel unterbrechen k�nnen ohne den Spielstand zu verlieren
	So dass ich angefangenes Spiel weiterspielen kann, nachdem ich es unterbrochen habe.
	
	Szenario: Der Benutzer pausiert das laufende Spiel,in dem er die App schlie�t und diese im Hintergrund weiterl�uft.
		Angenommen ein Spiel ist aktiv
		Wenn ich die App schlie�e
		Dann wird die App im momentanen Zustand mit allen Vortschritten eingefrohren und kann zu jedem Zeitpunkt an dieser Stelle weitergespielt werden.