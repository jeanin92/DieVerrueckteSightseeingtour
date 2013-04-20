<<<<<<< HEAD
# language: de

@spiel_starten
FunktionalitŠt: Der Benutzer kann einen existierenden Spieler löschen.
	Als ein Benutzer des gerŠtes, auf dem das Spiel lŠuft
	Will ich überflüssige Spieler löschen können
	So dass ich die Anzahl der teilnehmenden Spieler anpassen kann.
	
	Grundlage: 
		Angenommen ich befinde mich auf dem Spieler-EinfŸge-Bildschirm
	
	@spieler_loeschen
	Szenario: Ich will einen vorhandenen Spieler lšschen.
		Wenn ich dem System sage, dass ich einen Spieler lšschen mšchte
		Dann fragt mich das System, ob ich das wirklich will
		Wenn ich zustimme
		Dann lšscht das System den Spieler aus dem Spiel
		Und ich befinde mich wieder auf dem Spieler-EinfŸge-Bildschirm
		Und der Spieler wird nicht mehr angezeigt
	
	@spieler_loeschen
	Szenario: Ich habe aus Versehen Spieler lšschen ausgewŠhlt, mšchte dies aber gar nicht.
		Wenn ich dem System sage, dass ich einen Spieler lšschen mšchte
		Dann fragt mich das System, ob ich das wirklich will
		Wenn ich ablehne
		Dann komme ich wieder auf den Spieler-EinfŸge-Bildschirm
		Und der Spieler wird noch als Spielteilnehmer angezeigt
	
	
	
=======
# language: de

@spiel_starten @spieler_loeschen
FunktionalitŠt: Der Benutzer kann Spieler vor Beginn des Spieles lšschen.
	Als ein Benutzer des GerŠtes, auf dem das Spiel lŠuft,
	Will ich einen zum Spiel hinzugefŸgten Spieler wieder lšschen kšnnen
	So dass ich die Anzahl der Spieler verringern kann.
	
	Grundlage: 
		Angenommen ich befinde mich auf dem Spieler-EinfŸge-Bildschirm

	Szenario: Ich will einen vorhandenen Spieler lšschen.
		Wenn ich dem System sage, dass ich einen Spieler lšschen mšchte
		Dann fragt mich das System, ob ich das wirklich will
		Wenn ich zustimme
		Dann lšscht das System den Spieler aus dem Spiel
		Und ich befinde mich wieder auf dem Spieler-EinfŸge-Bildschirm
		Und der Spieler wird nicht mehr angezeigt
	
	Szenario: Ich habe aus Versehen Spieler lšschen ausgewŠhlt, mšchte dies aber gar nicht.
		Wenn ich dem System sage, dass ich einen Spieler lšschen mšchte
		Dann fragt mich das System, ob ich das wirklich will
		Wenn ich ablehne
		Dann komme ich wieder auf den Spieler-EinfŸge-Bildschirm
		Und der Spieler wird noch als Spielteilnehmer angezeigt
>>>>>>> CHG: split spieler_erstellen feature in loeschen, erstellen and bearbeiten
