# language: de
Funktionalität: Der Benutzer verwendet die Spielanleitung.
	Als ein Benutzer
	Will ich die Spielanleitung lesen und dann weiter zum Spiel kommen können
	So dass ich weiss, wie das Spiel funktioniert.
	
	Szenario: Der Benutzer liest die Spielanleitung bevor das Spiel konfigueriert und gestartet wird.
		Angenommen ich befinde mich auf dem Start-Bildschirm
		Wenn ich den Spielanleitungs-Button klicke
		Dann öffnet sich der Anleitungs-Bildschirm
		Und ich muss bis zum Ende scrollen
		Und ich klicke den Weiter-Button
		Und der Spielmodus-Bildschirm öffnet sich
		
	Szenario: Der Benutzer liest die Spielanleitung während er im Spiel an der Reihe ist. 
		Angenommen ein Spiel ist aktiv
		Und ich befinde mich auf dem Spiel-Bildschirm
		Und ich bin an der Reihe
		Aber es ist kein Popup geöffnet
		Wenn ich den Spielanleitungs-Button klicke
		Dann öffnet sich der Anleitungs-Bildschirm
		Und ich muss bis zum Ende scrollen
		Und ich klicke den Weiter-Button
		Und ich komme zurück zum Spiel-Bildschirm
		Und ich kann da weiter machen, wo ich aufgehört habe