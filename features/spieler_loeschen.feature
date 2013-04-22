#language: de

@spiel_starten @spieler_loeschen
Funktionalit�t: Der Benutzer kann Spieler vor Beginn des Spieles l�schen.
	Als ein Benutzer des Ger�tes, auf dem das Spiel l�uft,
	Will ich einen zum Spiel hinzugef�gten Spieler wieder l�schen k�nnen
	So dass ich die Anzahl der Spieler verringern kann.
	
	Grundlage: 
		Angenommen ich befinde mich auf dem Spieler-Einf�ge-Bildschirm

	Szenario: Ich will einen vorhandenen Spieler l�schen.
		Wenn ich dem System sage, dass ich einen Spieler l�schen m�chte
		Dann fragt mich das System, ob ich das wirklich will
		Wenn ich zustimme
		Dann l�scht das System den Spieler aus dem Spiel
		Und ich befinde mich wieder auf dem Spieler-Einf�ge-Bildschirm
		Und der Spieler wird nicht mehr angezeigt
	
	Szenario: Ich habe aus Versehen Spieler l�schen ausgew�hlt, m�chte dies aber gar nicht.
		Wenn ich dem System sage, dass ich einen Spieler l�schen m�chte
		Dann fragt mich das System, ob ich das wirklich will
		Wenn ich ablehne
		Dann komme ich wieder auf den Spieler-Einf�ge-Bildschirm
		Und der Spieler wird noch als Spielteilnehmer angezeigt