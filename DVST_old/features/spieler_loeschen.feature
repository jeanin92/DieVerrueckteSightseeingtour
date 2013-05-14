#language: de

#@spiel_starten @spieler_loeschen
#Funktionalität: Der Benutzer kann Spieler vor Beginn des Spieles loeschen.
#	Als ein Benutzer des Geraetes, auf dem das Spiel laeuft,
#	Will ich einen zum Spiel hinzugefuegten Spieler wieder loeschen koennen
#	So dass ich die Anzahl der Spieler verringern kann.
	
#	Grundlage: 
#		Angenommen ich befinde mich auf dem Spieler-Einfuege-Bildschirm

#	Szenario: Ich will einen vorhandenen Spieler loeschen.
#		Wenn ich dem System sage, dass ich einen Spieler loeschen moechte
#		Dann fragt mich das System, ob ich das wirklich will
#		Wenn ich zustimme
#		Dann loescht das System den Spieler aus dem Spiel
#		Und ich befinde mich wieder auf dem Spieler-Einfuege-Bildschirm
#		Und der Spieler wird nicht mehr angezeigt
	
#	Szenario: Ich habe aus Versehen Spieler loeschen ausgewaehlt, moechte dies aber gar nicht.
#		Wenn ich dem System sage, dass ich einen Spieler loeschen moechte
#		Dann fragt mich das System, ob ich das wirklich will
#		Wenn ich ablehne
#		Dann komme ich wieder auf den Spieler-Einfuege-Bildschirm
#		Und der Spieler wird noch als Spielteilnehmer angezeigt