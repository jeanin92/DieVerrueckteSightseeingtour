#language: de

@spiel_starten @spielmodus_waehlen
Funktionalität: Der Benutzer will den Spielmodus wählen.
	Als Spieler
	Will ich entscheiden, ob ich gegen den Computer oder andere Spieler spielen möchte und
	ob ich auf einem oder mehreren Geräten spielen will.
	
	Szenario: Der Benutzer will gegen die KI spielen.
		Angenommen ich befinde mich auf dem Spielmodus-Bildschirm
		Wenn ich mich für ein Einspieler-Spiel entscheide
		Dann gelange ich zum Figurwahl-Bildschirm
	
	Szenariogrundriss: Der Benutzer will gegen andere Spieler spielen.
		Angenommen ich befinde mich auf dem Spielmodus-Bildschirm
		Wenn ich mich für ein Mehrspieler-Spiel entscheide
		Dann fragt mich das System auf wie vielen Geräten ich spielen möchte
		Wenn ich sage, ich möchte auf <anzahl> spielen
		Dann gelange ich zum <bildschirm>
		
		Beispiele: 
		| anzahl 			| bildschirm					|
		| einem Gerät 		| Spieler-Einfüge-Bildschirm	|
		| mehreren Geräten 	| Verbindungsaufbau-Bildschirm	| 