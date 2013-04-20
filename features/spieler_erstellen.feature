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