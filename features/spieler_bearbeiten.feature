# language: de

@spiel_starten
Funktionalität: Der Benutzer kann einen existierenden Spieler bearbeiten.
	Als ein Benutzer des gerätes, auf dem das Spiel läuft
	Will ich bestehende Spieler bearbeiten kˆnnen
	So dass ich sie personalisieren und gegebenenfalls Fehleingaben korrigieren kann.
	
	Grundlage: 
		Angenommen ich befinde mich auf dem Spieler-Einfüge-Bildschirm
		
	@spieler_bearbeiten
	Szenario: Ich will einen vorhandenen Spieler bearbeiten.
		Wenn ich dem System sage, dass ich einen Spieler bearbeiten möchte
		Dann zeigt mir das System seine Daten
		Wenn ich etwas ändere
		Und ich meine Veränderungen absende
		Dann verändert das System die Daten des Spielers
		Und ich befinde mich wieder auf dem Spieler-Einfüge-Bildschirm
		Und der Spieler wird noch als Spielteilnehmer angezeigt
	
	@spieler_bearbeiten	
	Szenario: Ich habe aus Versehen Spieler bearbeiten ausgewählt, möchte dies aber gar nicht.
		Wenn ich dem System sage, dass ich einen Spieler bearbeiten möchte
		Dann zeigt mir das System seine Daten
		Wenn ich dem System sage, dass ich nichts ändern will
		Dann bleiben die Daten des Spielers gleich
		Und ich befinde mich wieder auf dem Spieler-Einfüge-Bildschirm
		Und der Spieler wird noch als Spielteilnehmer angezeigt	