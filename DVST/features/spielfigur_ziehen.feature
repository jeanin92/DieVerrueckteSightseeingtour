# language: de

@spielzug_ausfuehren @spielfigur_ziehen
Funktionalität: Der Spieler kann seine Figur auf dem Spielfeld bewegen.
	Als Spieler
	Will ich meine Figur setzen
	So dass ich meine nächste Sehenswürdigkeit erreiche.
	
	Szenario: Der Spieler wählt eine Zielplatte, die er erreichen kann.
		Angenommen ein Spiel ist aktiv
		Und ich bin an der Reihe
		Wenn ich auf eine erreichbare Spielplatte klicke
		Und dann auf die Platte meiner Spielfigur
		Dann bewegt sich meine Figur an die Stelle
	
	Szenario: Der Spieler will stehen bleiben.
		Angenommen ein Spiel ist aktiv
		Und ich bin an der Reihe
		Wenn ich zwei mal auf die Platte mit meiner Spielfigur klicke
		Dann bleibt meine Figur stehen
		Und mein Zug ist beendet
	
	Szenario: Der Spieler will sich auf eine Platte bewegen, auf die er nicht kommen kann.
		Angenommen ein Spiel ist aktiv
		Und ich bin an der Reihe
		Wenn ich auf eine nicht erreichbare Spielplatte klicke
		Und dann auf die Platte meiner Spielfigur
		Dann wird mir gesagt, dass diese Platte nicht erreichbar ist
		Und ich darf erneut eine Zielplatte anlicken

	Szenario: Der Spieler ändert seine Zielplatte bevor der gültige Zug ausgeführt wird.
		Angenommen ein Spiel ist aktiv
		Und ich bin an der Reihe
		Wenn ich auf eine erreichbare Spielplatte klicke
		Und dann auf eine andere Platte, auf der meine Figur nicht steht
		Und dann auf die Platte meiner Spielfigur
		Dann nimmt das Spiel die letztgeklickte Platte als Ziel an
		Und meine Figur bewegt sich an die Stelle
		
	Szenario: Der Spieler ändert seine Zielplatte bevor er einen ungültigen Zug versucht.
		Angenommen ein Spiel ist aktiv
		Und ich bin an der Reihe
		Wenn ich auf eine beliebige Spielplatte klicke
		Und dann auf eine andere nicht erreichbare Platte
		Und dann auf die Platte meiner Spielfigur
		Dann nimmt das Spiel die letztgeklickte Platte als Ziel an
		Und mir wird gesagt, dass diese Platte nicht erreichbar ist
		Und ich darf erneut ein Zielplatte anklicken
		
	Szenario: Der Spieler erreicht sein Ziel.
		Angenommen ein Spiel ist aktiv
		Und ich bin an der Reihe
		Wenn ich auf eine beliebige Spielplatte klicke
		Und dann auf die Platte meiner Spielfigur
		Dann bewegt sich meine Figur an die Stelle
		Und mir wird gesagt, dass ich mein Ziel erreicht habe