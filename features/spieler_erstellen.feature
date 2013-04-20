<<<<<<< HEAD
# language: de

@spiel_starten
Funktionalit�t: Der Benutzer kann einen neuen Spieler erstellen.
	Als ein Benutzer des ger�tes, auf dem das Spiel l�uft
	Will ich jedem Spielstein einen Namen, eine Farbe und eine Form zuweisen k�nnen und jeden Spieler anlegen k�nnen
	So dass ich sie personalisieren und leicht auf dem Spielfeld wiederfinden kann.
	
	Grundlage: 
		Angenommen ich befinde mich auf dem Spieler-Einf�ge-Bildschirm
	
	@spieler_erstellen
	Szenario: Ich will einen neuen Spieler zum Spiel mit korrekten Daten hinzuf�gen.
		Wenn ich dem System sage, dass ich einen Spieler anlegen m�chte
		Dann zeigt mir das System den Figurwahl-Bildschirm
		Und ich gebe die ben�tigten Daten ein
		Dann komme ich wieder auf den Spieler-Einf�ge-Bildschirm
		Und der Spieler wird als neuer Spielteilnehmer angezeigt
		
	@spieler_erstellen
	Szenario: Ich will einen neuen Spieler zum Spiel hinzuf�gen, aber der Name enth�lt unerlaubte Zeichen.
		Beim zweiten Versuch stimmt die Eingabe.
		Wenn ich dem System sage, dass ich einen Spieler anlegen m�chte
		Dann zeigt mir das System den Figurwahl-Bildschirm
		Und ich gebe die ben�tigten Daten ein
		Dann sagt mir das System, dass mein Name nicht erlaubt ist
		Und ich darf einen anderen Namen eingeben
		Dann komme ich wieder auf den Spieler-Einf�ge-Bildschirm
		Und der Spieler wird als neuer Spielteilnehmer angezeigt
		
	@spieler_erstellen
	Szenario: Ich will einen neuen Spieler zum Spiel hinzuf�gen, aber die Kombination Farbe-Figur existiert bereits.
		Beim zweiten Versuch stimmt die Eingabe.
		Wenn ich dem System sage, dass ich einen Spieler anlegen m�chte
		Dann zeigt mir das System den Figurwahl-Bildschirm
		Und ich gebe die ben�tigten Daten ein
		Dann sagt mir das System, dass meine Farb-Figur-Kombination schon vergben ist
		Und ich darf eine andere w�hlen
		Dann komme ich wieder auf den Spieler-Einf�ge-Bildschirm
		Und der Spieler wird als neuer Spielteilnehmer angezeigt	
=======
# language: de

@spiel_starten @spieler_erstellen
Funktionalit�t: Der Benutzer kann Spieler zum neuen Spiel hinzuf�gen.
	Als ein Benutzer des Ger�tes, auf dem das Spiel l�uft
	Will ich jedem Spieler einen Namen, eine Farbe und eine Form zuweisen k�nnen
	So dass ich sie personalisieren und leicht auf dem Spielfeld wiederfinden kann.
	
	Szenario: Ich will einen neuen Spieler zum Spiel mit korrekten Daten hinzuf�gen.
		Angenommen ich befinde mich auf dem Spieler-Einf�ge-Bildschirm
		Wenn ich dem System sage, dass ich einen Spieler anlegen m�chte
		Dann zeigt mir das System den Figurwahl-Bildschirm
		Und ich gebe die ben�tigten Daten ein
		Dann komme ich wieder auf den Spieler-Einf�ge-Bildschirm
		Und der Spieler wird als neuer Spielteilnehmer angezeigt
	
	Szenariogrundriss: Ich will einen neuen Spieler zum Spiel hinzuf�gen, aber eine der Eingaben ist unzul�ssig.
		Angenommen ich befinde mich auf dem Spieler-Einf�ge-Bildschirm
		Wenn ich dem System sage, dass ich einen Spieler anlegen m�chte
		Dann zeigt mir das System den Figurwahl-Bildschirm
		Und ich will <eingabe>
		Dann sagt mir das System, <nachricht>
		Und ich befinde mich auf dem Figurwahl-Bildschirm
		Und ich darf Name, Farbe und Form eingeben
		
		Beispiele: 
			| eingabe 																	| nachricht 											|
			| unerlaubte Zeichen im Namen eingeben										| dass mein Name unerlaubte Zeichen enth�lt 			|
			| eine Farbe-Figur-Kombination eingeben, die bereits jemand gew�hlt hat 	| dass meine Farb-Figur-Kombination schon vergeben ist	|
			| einen Namen eingeben, der zu lang ist 									| wenn ich die maximale L�nge erreicht habe 			|
		
		
	Szenariogrundriss: Ich �berlege mir, ob ich den neuen Spieler wirklich hinzuf�gen will.
		Angenommen ich befinde mich auf dem Spieler-Einf�ge-Bildschirm
		Wenn ich dem System sage, dass ich einen Spieler anlegen m�chte
		Dann zeigt mir das System den Figurwahl-Bildschirm
		Und ich sage dem System, dass ich doch keinen neuen Spieler m�chte
		Dann fragt mich das System, ob ich mir sicher bin
		Und ich sage <entscheidung>
		Und ich befinde mich auf dem <bildschirm>
		
		Beispiele:
			| entscheidung 	| bildschirm 					|
			| ja			| Spieler-Einf�ge-Bildschirm	|
			| nein			| Figurwahl-Bildschirm			|

	
>>>>>>> CHG: split spieler_erstellen feature in loeschen, erstellen and bearbeiten
