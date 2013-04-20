# language: de

@spiel_starten
Funktionalit�t: Der Benutzer kann einen existierenden Spieler l�schen.
	Als ein Benutzer des ger�tes, auf dem das Spiel l�uft
	Will ich �berfl�ssige Spieler l�schen k�nnen
	So dass ich die Anzahl der teilnehmenden Spieler anpassen kann.
	
	Grundlage: 
		Angenommen ich befinde mich auf dem Spieler-Einf�ge-Bildschirm
	
	@spieler_loeschen
	Szenario: Ich will einen vorhandenen Spieler l�schen.
		Wenn ich dem System sage, dass ich einen Spieler l�schen m�chte
		Dann fragt mich das System, ob ich das wirklich will
		Wenn ich zustimme
		Dann l�scht das System den Spieler aus dem Spiel
		Und ich befinde mich wieder auf dem Spieler-Einf�ge-Bildschirm
		Und der Spieler wird nicht mehr angezeigt
	
	@spieler_loeschen
	Szenario: Ich habe aus Versehen Spieler l�schen ausgew�hlt, m�chte dies aber gar nicht.
		Wenn ich dem System sage, dass ich einen Spieler l�schen m�chte
		Dann fragt mich das System, ob ich das wirklich will
		Wenn ich ablehne
		Dann komme ich wieder auf den Spieler-Einf�ge-Bildschirm
		Und der Spieler wird noch als Spielteilnehmer angezeigt
	
	
	