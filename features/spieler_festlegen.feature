# language: de

@spiel_starten
Funktionalität: Der Benutzer kann die teilnehmenden Spieler festlegen.
	Als ein Benutzer des gerätes, auf dem das Spiel läuft
	Will ich jedem Spielstein einen Namen, eine Farbe und eine Form zuweisen können und jeden Spieler anlegen, bearbeiten und löschen können
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
	
	@spieler_bearbeiten
	Szenario: Ich will einen vorhandenen Spieler bearbeiten.
		Wenn ich dem System sage, dass ich einen Spieler bearbeiten möchte
		Dann zeigt mir das System seine Daten
		Wenn ich etwas ändere
		Und ich meine Veränderungen absende
		Dann verändert das System die Daten des Spielers
		Und ich befinde mich wieder auf dem Spieler-Einfüge-Bildschirm
		Und der Spieler wird noch als Spielteilnehmer angezeigt
	
	@spieler_bearbeiten	
	Szenario: Ich habe aus Versehen Spieler bearbeiten ausgewählt, möchte dies aber gar nicht.
		Wenn ich dem System sage, dass ich einen Spieler bearbeiten möchte
		Dann zeigt mir das System seine Daten
		Wenn ich dem System sage, dass ich nichts ändern will
		Dann bleiben die Daten des Spielers gleich
		Und ich befinde mich wieder auf dem Spieler-Einfüge-Bildschirm
		Und der Spieler wird noch als Spielteilnehmer angezeigt
	
	@spieler_loeschen
	Szenario: Ich will einen vorhandenen Spieler löschen.
		Wenn ich dem System sage, dass ich einen Spieler löschen möchte
		Dann fragt mich das System, ob ich das wirklich will
		Wenn ich zustimme
		Dann löscht das System den Spieler aus dem Spiel
		Und ich befinde mich wieder auf dem Spieler-Einfüge-Bildschirm
		Und der Spieler wird nicht mehr angezeigt
	
	@spieler_loeschen
	Szenario: Ich habe aus Versehen Spieler löschen ausgewählt, möchte dies aber gar nicht.
		Wenn ich dem System sage, dass ich einen Spieler löschen möchte
		Dann fragt mich das System, ob ich das wirklich will
		Wenn ich ablehne
		Dann komme ich wieder auf den Spieler-Einfüge-Bildschirm
		Und der Spieler wird noch als Spielteilnehmer angezeigt
	
	
	