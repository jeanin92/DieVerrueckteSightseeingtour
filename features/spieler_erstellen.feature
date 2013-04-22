#language: de

@spiel_starten @spieler_erstellen
Funktionalität: Der Benutzer kann Spieler zum neuen Spiel hinzufügen.
	Als ein Benutzer des Gerätes, auf dem das Spiel läuft
	Will ich jedem Spieler einen Namen, eine Farbe und eine Form zuweisen können
	So dass ich sie personalisieren und leicht auf dem Spielfeld wiederfinden kann.
	
	Szenario: Ich will einen neuen Spieler zum Spiel mit korrekten Daten hinzufügen.
		Angenommen ich befinde mich auf dem Spieler-Einfüge-Bildschirm
		Wenn ich dem System sage, dass ich einen Spieler anlegen möchte
		Dann zeigt mir das System den Figurwahl-Bildschirm
		Und ich gebe die benötigten Daten ein
		Dann komme ich wieder auf den Spieler-Einfüge-Bildschirm
		Und der Spieler wird als neuer Spielteilnehmer angezeigt
	
	Szenariogrundriss: Ich will einen neuen Spieler zum Spiel hinzufügen, aber eine der Eingaben ist unzulässig.
		Angenommen ich befinde mich auf dem Spieler-Einfüge-Bildschirm
		Wenn ich dem System sage, dass ich einen Spieler anlegen möchte
		Dann zeigt mir das System den Figurwahl-Bildschirm
		Und ich will <eingabe>
		Dann sagt mir das System, <nachricht>
		Und ich befinde mich auf dem Figurwahl-Bildschirm
		Und ich darf Name, Farbe und Form eingeben
		
		Beispiele: 
			| eingabe 																	| nachricht 											|
			| unerlaubte Zeichen im Namen eingeben										| dass mein Name unerlaubte Zeichen enthält 			|
			| eine Farbe-Figur-Kombination eingeben, die bereits jemand gewählt hat 	| dass meine Farb-Figur-Kombination schon vergeben ist	|
			| einen Namen eingeben, der zu lang ist 									| wenn ich die maximale Länge erreicht habe 			|
		
		
	Szenariogrundriss: Ich überlege mir, ob ich den neuen Spieler wirklich hinzufügen will.
		Angenommen ich befinde mich auf dem Spieler-Einfüge-Bildschirm
		Wenn ich dem System sage, dass ich einen Spieler anlegen möchte
		Dann zeigt mir das System den Figurwahl-Bildschirm
		Und ich sage dem System, dass ich doch keinen neuen Spieler möchte
		Dann fragt mich das System, ob ich mir sicher bin
		Und ich sage <entscheidung>
		Und ich befinde mich auf dem <bildschirm>
		
		Beispiele:
			| entscheidung 	| bildschirm 					|
			| ja			| Spieler-Einfüge-Bildschirm	|
			| nein			| Figurwahl-Bildschirm			|
