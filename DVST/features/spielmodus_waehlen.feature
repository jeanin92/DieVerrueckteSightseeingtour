#language: de

@spiel_starten @spielmodus_waehlen
Funktionalität: Der Benutzer will den Spielmodus waehlen.
	Als Spieler
	Will ich entscheiden, ob ich gegen den Computer oder andere Spieler spielen moechte und
	ob ich auf einem oder mehreren Geraeten spielen will.

	
	Szenario: Der Benutzer will gegen die KI spielen.	
		Angenommen ich befinde mich auf dem Spielmodus-Bildschirm
		Wenn ich mich fuer ein Einspieler-Spiel entscheide
		Dann gelange ich zum Figurwahl-Bildschirm
	
	Szenariogrundriss: Der Benutzer will gegen andere Spieler spielen.
		Angenommen ich befinde mich auf dem Spielmodus-Bildschirm
		Wenn ich mich fuer ein Mehrspieler-Spiel entscheide
		Dann fragt mich das System auf wie vielen Geraeten ich spielen moechte
		Wenn ich sage, ich moechte auf "<Anzahl>" spielen
		Dann gelange ich zum "<Bildschirm>"
		
		Beispiele: 
		| Anzahl 				| Bildschirm					|
		| einem Geraet 			| Spieler-Einfuege-Bildschirm	|
		| mehreren Geraeten 	| Verbindungsaufbau-Bildschirm	| 