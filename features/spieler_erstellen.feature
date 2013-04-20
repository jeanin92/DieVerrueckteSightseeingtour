<<<<<<< HEAD
# language: de

@spiel_starten
Funktionalität: Der Benutzer kann einen neuen Spieler erstellen.
	Als ein Benutzer des gerätes, auf dem das Spiel läuft
	Will ich jedem Spielstein einen Namen, eine Farbe und eine Form zuweisen können und jeden Spieler anlegen können
	So dass ich sie personalisieren und leicht auf dem Spielfeld wiederfinden kann.
	
	Grundlage: 
		Angenommen ich befinde mich auf dem Spieler-Einfüge-Bildschirm
	
	@spieler_erstellen
	Szenario: Ich will einen neuen Spieler zum Spiel mit korrekten Daten hinzufügen.
		Wenn ich dem System sage, dass ich einen Spieler anlegen möchte
		Dann zeigt mir das System den Figurwahl-Bildschirm
		Und ich gebe die benötigten Daten ein
		Dann komme ich wieder auf den Spieler-Einfüge-Bildschirm
		Und der Spieler wird als neuer Spielteilnehmer angezeigt
		
	@spieler_erstellen
	Szenario: Ich will einen neuen Spieler zum Spiel hinzufügen, aber der Name enthält unerlaubte Zeichen.
		Beim zweiten Versuch stimmt die Eingabe.
		Wenn ich dem System sage, dass ich einen Spieler anlegen möchte
		Dann zeigt mir das System den Figurwahl-Bildschirm
		Und ich gebe die benötigten Daten ein
		Dann sagt mir das System, dass mein Name nicht erlaubt ist
		Und ich darf einen anderen Namen eingeben
		Dann komme ich wieder auf den Spieler-Einfüge-Bildschirm
		Und der Spieler wird als neuer Spielteilnehmer angezeigt
		
	@spieler_erstellen
	Szenario: Ich will einen neuen Spieler zum Spiel hinzufügen, aber die Kombination Farbe-Figur existiert bereits.
		Beim zweiten Versuch stimmt die Eingabe.
		Wenn ich dem System sage, dass ich einen Spieler anlegen möchte
		Dann zeigt mir das System den Figurwahl-Bildschirm
		Und ich gebe die benötigten Daten ein
		Dann sagt mir das System, dass meine Farb-Figur-Kombination schon vergben ist
		Und ich darf eine andere wählen
		Dann komme ich wieder auf den Spieler-Einfüge-Bildschirm
		Und der Spieler wird als neuer Spielteilnehmer angezeigt	
=======
# language: de

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

	
>>>>>>> CHG: split spieler_erstellen feature in loeschen, erstellen and bearbeiten
