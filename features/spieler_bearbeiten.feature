#language: de

@spiel_starten @spieler_bearbeiten
Funktionalität: Der Benutzer kann Spielereinstellungen vor Beginn des Spieles bearbeiten.
	Als ein Benutzer des Gerätes, auf dem das Spiel läuft,
	Will ich die Einstellungen (Farbe, Figur, Namen) eines zum Spiel hinzugefügten Spielers bearbeiten können
	So dass ich spontane Meinungsänderungen berücksichtigen kann
	
	Szenario: Ich habe aus Versehen Spieler bearbeiten ausgewählt, möchte dies aber gar nicht.
		Angenommen ich befinde mich auf dem Spieler-Einfüge-Bildschirm
		Wenn ich dem System sage, dass ich einen Spieler bearbeiten möchte
		Dann zeigt mir das System dessen Daten
		Wenn ich dem System sage, dass ich nichts ändern will
		Dann bleiben die Daten des Spielers gleich
		Und ich befinde mich wieder auf dem Spieler-Einfüge-Bildschirm
		Und der Spieler wird mit dem alten Namen als Spielteilnehmer angezeigt
	
	Szenariogrundriss: Ich mache erlaubte Änderungen beim Bearbeiten eines Spielers.
		Angenommen ich befinde mich auf dem Spieler-Einfüge-Bildschirm
		Wenn ich dem System sage, dass ich einen Spieler bearbeiten möchte
		Dann zeigt mir das System seine Daten auf dem Figurwahl-Bildschirm
		Wenn ich <änderung> ändere
		Und ich meine Veränderungen absende
		Dann verändert das System die Daten des Spielers
		Und ich befinde mich wieder auf dem Spieler-Einfüge-Bildschirm
		Und der Spieler wird <spielereinstellung> als Spielteilnehmer angezeigt
		
		Beispiele:
			| änderung 		| spielereinstellung 													|
			| seinen Namen 	| mit dem neuen Namen	|
			| seine Farbe	| mit dem alten Namen 	|
	
	
	
	Szenariogrundriss: Ich mache unerlaubte Änderungen beim Bearbeiten eines Spielers.
		Angenommen ich befinde mich auf dem Spieler-Einfüge-Bildschirm
		Wenn ich dem System sage, dass ich einen Spieler bearbeiten möchte
		Dann zeigt mir das System seine Daten auf dem Figurwahl-Bildschirm
		Wenn ich <änderung> ändere
		Und ich meine Veränderungen absende
		Dann weist mich das System darauf hin, <fehler>
		Und ich befinde mich wieder auf dem Figurwahl-Bildschirm
		
		Beispiele:
			| änderung 		| fehler 													|
			| seinen Namen 	| dass sich unerlaubte Zeichen im Namen befinden 			|
			| seine Figur	| dass diese Kombination Farbe-Figur bereits vergeben ist 	|

