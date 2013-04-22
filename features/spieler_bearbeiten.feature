#language: de

@spiel_starten @spieler_bearbeiten
Funktionalit�t: Der Benutzer kann Spielereinstellungen vor Beginn des Spieles bearbeiten.
	Als ein Benutzer des Ger�tes, auf dem das Spiel l�uft,
	Will ich die Einstellungen (Farbe, Figur, Namen) eines zum Spiel hinzugef�gten Spielers bearbeiten k�nnen
	So dass ich spontane Meinungs�nderungen ber�cksichtigen kann
	
	Szenario: Ich habe aus Versehen Spieler bearbeiten ausgew�hlt, m�chte dies aber gar nicht.
		Angenommen ich befinde mich auf dem Spieler-Einf�ge-Bildschirm
		Wenn ich dem System sage, dass ich einen Spieler bearbeiten m�chte
		Dann zeigt mir das System dessen Daten
		Wenn ich dem System sage, dass ich nichts �ndern will
		Dann bleiben die Daten des Spielers gleich
		Und ich befinde mich wieder auf dem Spieler-Einf�ge-Bildschirm
		Und der Spieler wird mit dem alten Namen als Spielteilnehmer angezeigt
	
	Szenariogrundriss: Ich mache erlaubte �nderungen beim Bearbeiten eines Spielers.
		Angenommen ich befinde mich auf dem Spieler-Einf�ge-Bildschirm
		Wenn ich dem System sage, dass ich einen Spieler bearbeiten m�chte
		Dann zeigt mir das System seine Daten auf dem Figurwahl-Bildschirm
		Wenn ich <�nderung> �ndere
		Und ich meine Ver�nderungen absende
		Dann ver�ndert das System die Daten des Spielers
		Und ich befinde mich wieder auf dem Spieler-Einf�ge-Bildschirm
		Und der Spieler wird <spielereinstellung> als Spielteilnehmer angezeigt
		
		Beispiele:
			| �nderung 		| spielereinstellung 													|
			| seinen Namen 	| mit dem neuen Namen	|
			| seine Farbe	| mit dem alten Namen 	|
	
	
	
	Szenariogrundriss: Ich mache unerlaubte �nderungen beim Bearbeiten eines Spielers.
		Angenommen ich befinde mich auf dem Spieler-Einf�ge-Bildschirm
		Wenn ich dem System sage, dass ich einen Spieler bearbeiten m�chte
		Dann zeigt mir das System seine Daten auf dem Figurwahl-Bildschirm
		Wenn ich <�nderung> �ndere
		Und ich meine Ver�nderungen absende
		Dann weist mich das System darauf hin, <fehler>
		Und ich befinde mich wieder auf dem Figurwahl-Bildschirm
		
		Beispiele:
			| �nderung 		| fehler 													|
			| seinen Namen 	| dass sich unerlaubte Zeichen im Namen befinden 			|
			| seine Figur	| dass diese Kombination Farbe-Figur bereits vergeben ist 	|

