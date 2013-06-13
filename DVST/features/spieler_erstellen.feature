#language: de

@spiel_starten @spieler_erstellen
Funktionalität: Der Benutzer kann Spieler zum neuen Spiel hinzufuegen.
	Als ein Benutzer des Geraetes, auf dem das Spiel laeuft
	Will ich jedem Spieler einen Namen, eine Farbe und eine Form zuweisen koennen
	So dass ich sie personalisieren und leicht auf dem Spielfeld wiederfinden kann.
	
	Szenario: Ich will einen neuen Spieler zum Spiel mit korrekten Daten hinzufuegen.
		Angenommen ich befinde mich auf dem Spieler-Einfuege-Bildschirm
		Wenn ich dem System sage, dass ich einen Spieler anlegen moechte
		Dann zeigt mir das System den Figurwahl-Bildschirm
		Und ich gebe die benoetigten Daten ein
		Dann komme ich wieder auf den Spieler-Einfuege-Bildschirm
		Und der Spieler wird als neuer Spielteilnehmer angezeigt
	
#	Szenariogrundriss: Ich will einen neuen Spieler zum Spiel hinzufuegen, aber eine der Eingaben ist unzulaessig.
#		Angenommen ich befinde mich auf dem Spieler-Einfuege-Bildschirm
#		Wenn ich dem System sage, dass ich einen Spieler anlegen moechte
#		Dann zeigt mir das System den Figurwahl-Bildschirm
#		Und ich will "<Eingabe>"
#		Dann sagt mir das System, "<Nachricht>"
#		Und ich befinde mich auf dem Figurwahl-Bildschirm
#		Und ich darf Name, Farbe und Form eingeben
#		
#		Beispiele: 
#			| Eingabe 																	| Nachricht 											|
#			| unerlaubte Zeichen im Namen eingeben										| dass mein Name unerlaubte Zeichen enthaelt 			|
#			| eine Farbe-Figur-Kombination eingeben, die bereits jemand gewaehlt hat 	| dass meine Farb-Figur-Kombination schon vergeben ist	|
#			| einen Namen eingeben, der zu lang ist 									| wenn ich die maximale Laenge erreicht habe 			|
#		
#		
#	Szenariogrundriss: Ich ueberlege mir, ob ich den neuen Spieler wirklich hinzufuegen will.
#		Angenommen ich befinde mich auf dem Spieler-Einfuege-Bildschirm
#		Wenn ich dem System sage, dass ich einen Spieler anlegen moechte
#		Dann zeigt mir das System den Figurwahl-Bildschirm
#		Und ich sage dem System, dass ich doch keinen neuen Spieler moechte
#		Dann fragt mich das System, ob ich mir sicher bin
#		Und ich sage "<Entscheidung>"
#		Und ich befinde mich auf dem "<Bildschirm>"
#		
#		Beispiele:
#			| Entscheidung 	| Bildschirm 					|
#			| ja			| Spieler-Einfuege-Bildschirm	|
#			| nein			| Figurwahl-Bildschirm			|