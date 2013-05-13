# language: de

@spiel_beenden
Funktionalität: Spiel beenden
	Als Benutzer, der das Spiel gestartet hat
	Will ich das laufende Spiel beenden und den Spielstand verwerfen koennen
	So dass ich ein neues Spiel anfangen kann, wann immer ich moechte.
	
	Szenario: Der Benutzer beendet das laufende Spiel, wenn er an der Reihe ist.
		Angenommen ein Spiel ist aktiv
		Und ich befinde mich auf dem Spiel-Bildschirm
		Wenn ich das Spiel beende
		Dann wird das Spiel mit all seinen Daten geloescht
		Und ich gelange auf den Spielmodus-Bildschirm