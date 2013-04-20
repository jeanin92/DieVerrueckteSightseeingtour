# language: de

@spiel_starten
Funktionalit�t: Der Benutzer kann einen existierenden Spieler bearbeiten.
	Als ein Benutzer des ger�tes, auf dem das Spiel l�uft
	Will ich bestehende Spieler bearbeiten k�nnen
	So dass ich sie personalisieren und gegebenenfalls Fehleingaben korrigieren kann.
	
	Grundlage: 
		Angenommen ich befinde mich auf dem Spieler-Einf�ge-Bildschirm
		
	@spieler_bearbeiten
	Szenario: Ich will einen vorhandenen Spieler bearbeiten.
		Wenn ich dem System sage, dass ich einen Spieler bearbeiten m�chte
		Dann zeigt mir das System seine Daten
		Wenn ich etwas �ndere
		Und ich meine Ver�nderungen absende
		Dann ver�ndert das System die Daten des Spielers
		Und ich befinde mich wieder auf dem Spieler-Einf�ge-Bildschirm
		Und der Spieler wird noch als Spielteilnehmer angezeigt
	
	@spieler_bearbeiten	
	Szenario: Ich habe aus Versehen Spieler bearbeiten ausgew�hlt, m�chte dies aber gar nicht.
		Wenn ich dem System sage, dass ich einen Spieler bearbeiten m�chte
		Dann zeigt mir das System seine Daten
		Wenn ich dem System sage, dass ich nichts �ndern will
		Dann bleiben die Daten des Spielers gleich
		Und ich befinde mich wieder auf dem Spieler-Einf�ge-Bildschirm
		Und der Spieler wird noch als Spielteilnehmer angezeigt	