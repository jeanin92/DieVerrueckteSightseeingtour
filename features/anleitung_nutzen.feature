#language: de

@anleitung_lesen
Funktionalität: Der Benutzer verwendet die Spielanleitung.
	Als ein Benutzer
	Will ich die Spielanleitung lesen und dann weiter zum Spiel kommen können
	So dass ich weiss, wie das Spiel funktioniert.
	
	Szenario: Der Benutzer liest die Spielanleitung bevor das Spiel konfigueriert und gestartet wird.
		Angenommen ich befinde mich auf dem Start-Bildschirm
		Wenn ich den Spielanleitungs-Button klicke
		Dann öffnet sich der Anleitungs-Bildschirm
		Und ich kann von dort zum Spielmodus-Bildschirm navigieren
	
	Szenario: Der Benutzer liest die Spielanleitung während er im Spiel an der Reihe ist. 
		Angenommen ein Spiel ist aktiv
		Und ich befinde mich auf dem Spiel-Bildschirm
		Und ich bin an der Reihe
		Wenn ich den Spielanleitungs-Button klicke
		Dann öffnet sich der Anleitungs-Bildschirm
		Und ich kann von dort zurück zum Spiel-Bildschirm navigieren
		Und ich kann da weiter machen, wo ich aufgehört habe