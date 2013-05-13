#language: de

@spiel_starten @spieler_bearbeiten
Funktionalität: Der Benutzer kann Spielereinstellungen vor Beginn des Spieles bearbeiten.
	Als ein Benutzer des Geraetes, auf dem das Spiel laeuft,
	Will ich die Einstellungen (Farbe, Figur, Namen) eines zum Spiel hinzugefuegten Spielers bearbeiten koennen
	So dass ich spontane Meinungsaenderungen beruecksichtigen kann
	
	Szenario: Ich habe aus Versehen Spieler bearbeiten ausgewaehlt, moechte dies aber gar nicht.
		Angenommen ich befinde mich auf dem Spieler-Einfuege-Bildschirm
		Wenn ich dem System sage, dass ich einen Spieler bearbeiten moechte
		Dann zeigt mir das System dessen Daten
		Wenn ich dem System sage, dass ich nichts aendern will
		Dann bleiben die Daten des Spielers gleich
		Und ich befinde mich wieder auf dem Spieler-Einfuege-Bildschirm
		Und der Spieler wird mit dem alten Namen als Spielteilnehmer angezeigt
	
	Szenariogrundriss: Ich mache erlaubte aenderungen beim Bearbeiten eines Spielers.
		Angenommen ich befinde mich auf dem Spieler-Einfuege-Bildschirm
		Wenn ich dem System sage, dass ich einen Spieler bearbeiten moechte
		Dann zeigt mir das System seine Daten auf dem Figurwahl-Bildschirm
		Wenn ich <aenderung> aendere
		Und ich meine Veraenderungen absende
		Dann veraendert das System die Daten des Spielers
		Und ich befinde mich wieder auf dem Spieler-Einfuege-Bildschirm
		Und der Spieler wird <Spielereinstellung> als Spielteilnehmer angezeigt
		
		Beispiele:
			| aenderung 		| Spielereinstellung 													|
			| seinen Namen 	| mit dem neuen Namen	|
			| seine Farbe	| mit dem alten Namen 	|
	
	
	
	Szenariogrundriss: Ich mache unerlaubte aenderungen beim Bearbeiten eines Spielers.
		Angenommen ich befinde mich auf dem Spieler-Einfuege-Bildschirm
		Wenn ich dem System sage, dass ich einen Spieler bearbeiten moechte
		Dann zeigt mir das System seine Daten auf dem Figurwahl-Bildschirm
		Wenn ich "<aenderung>" aendere
		Und ich meine Veraenderungen absende
		Dann weist mich das System darauf hin, "<Fehler>"
		Und ich befinde mich wieder auf dem Figurwahl-Bildschirm
		
		Beispiele:
			| aenderung 		| Fehler 													|
			| seinen Namen 	| dass sich unerlaubte Zeichen im Namen befinden 			|
			| seine Figur	| dass diese Kombination Farbe-Figur bereits vergeben ist 	|

