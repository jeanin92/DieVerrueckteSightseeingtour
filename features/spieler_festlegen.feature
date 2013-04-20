# language: de

@spiel_starten
Funktionalit�t: Der Benutzer kann die teilnehmenden Spieler festlegen.
	Als ein Benutzer des ger�tes, auf dem das Spiel l�uft
	Will ich jedem Spielstein einen Namen, eine Farbe und eine Form zuweisen k�nnen und jeden Spieler anlegen, bearbeiten und l�schen k�nnen
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
	
	@spieler_bearbeiten
	Szenario: Ich will einen vorhandenen Spieler bearbeiten.
		Wenn ich dem System sage, dass ich einen Spieler bearbeiten m�chte
		Dann zeigt mir das System seine Daten
		Wenn ich etwas �ndere
		Und ich meine Ver�nderungen absende
		Dann ver�ndert das System die Daten des Spielers
		Und ich befinde mich wieder auf dem Spieler-Einf�ge-Bildschirm
		Und der Spieler wird noch als Spielteilnehmer angezeigt
	
	@spieler_bearbeiten	
	Szenario: Ich habe aus Versehen Spieler bearbeiten ausgew�hlt, m�chte dies aber gar nicht.
		Wenn ich dem System sage, dass ich einen Spieler bearbeiten m�chte
		Dann zeigt mir das System seine Daten
		Wenn ich dem System sage, dass ich nichts �ndern will
		Dann bleiben die Daten des Spielers gleich
		Und ich befinde mich wieder auf dem Spieler-Einf�ge-Bildschirm
		Und der Spieler wird noch als Spielteilnehmer angezeigt
	
	@spieler_loeschen
	Szenario: Ich will einen vorhandenen Spieler l�schen.
		Wenn ich dem System sage, dass ich einen Spieler l�schen m�chte
		Dann fragt mich das System, ob ich das wirklich will
		Wenn ich zustimme
		Dann l�scht das System den Spieler aus dem Spiel
		Und ich befinde mich wieder auf dem Spieler-Einf�ge-Bildschirm
		Und der Spieler wird nicht mehr angezeigt
	
	@spieler_loeschen
	Szenario: Ich habe aus Versehen Spieler l�schen ausgew�hlt, m�chte dies aber gar nicht.
		Wenn ich dem System sage, dass ich einen Spieler l�schen m�chte
		Dann fragt mich das System, ob ich das wirklich will
		Wenn ich ablehne
		Dann komme ich wieder auf den Spieler-Einf�ge-Bildschirm
		Und der Spieler wird noch als Spielteilnehmer angezeigt
	
	
	