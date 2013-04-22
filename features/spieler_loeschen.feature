#language: de

@spiel_starten @spieler_loeschen
Funktionalität: Der Benutzer kann Spieler vor Beginn des Spieles löschen.
	Als ein Benutzer des Gerätes, auf dem das Spiel läuft,
	Will ich einen zum Spiel hinzugefügten Spieler wieder löschen können
	So dass ich die Anzahl der Spieler verringern kann.
	
	Grundlage: 
		Angenommen ich befinde mich auf dem Spieler-Einfüge-Bildschirm

	Szenario: Ich will einen vorhandenen Spieler löschen.
		Wenn ich dem System sage, dass ich einen Spieler löschen möchte
		Dann fragt mich das System, ob ich das wirklich will
		Wenn ich zustimme
		Dann löscht das System den Spieler aus dem Spiel
		Und ich befinde mich wieder auf dem Spieler-Einfüge-Bildschirm
		Und der Spieler wird nicht mehr angezeigt
	
	Szenario: Ich habe aus Versehen Spieler löschen ausgewählt, möchte dies aber gar nicht.
		Wenn ich dem System sage, dass ich einen Spieler löschen möchte
		Dann fragt mich das System, ob ich das wirklich will
		Wenn ich ablehne
		Dann komme ich wieder auf den Spieler-Einfüge-Bildschirm
		Und der Spieler wird noch als Spielteilnehmer angezeigt