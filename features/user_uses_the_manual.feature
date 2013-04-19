# language: de
Funktionalit�t: Der Benutzer verwendet die Spielanleitung.
	Als ein Benutzer
	Will ich die Spielanleitung lesen und dann weiter zum Spiel kommen k�nnen
	So dass ich weiss, wie das Spiel funktioniert.
	
	Szenario: Der Benutzer liest die Spielanleitung bevor das Spiel konfigueriert und gestartet wird.
		Angenommen ich befinde mich auf dem Start-Bildschirm
		Wenn ich den Spielanleitungs-Button klicke
		Dann �ffnet sich der Anleitungs-Bildschirm
		Und ich muss bis zum Ende scrollen
		Und ich klicke den Weiter-Button
		Und der Spielmodus-Bildschirm �ffnet sich
		
	Szenario: Der Benutzer liest die Spielanleitung w�hrend er im Spiel an der Reihe ist. 
		Angenommen ein Spiel ist aktiv
		Und ich befinde mich auf dem Spiel-Bildschirm
		Und ich bin an der Reihe
		Aber es ist kein Popup ge�ffnet
		Wenn ich den Spielanleitungs-Button klicke
		Dann �ffnet sich der Anleitungs-Bildschirm
		Und ich muss bis zum Ende scrollen
		Und ich klicke den Weiter-Button
		Und ich komme zur�ck zum Spiel-Bildschirm
		Und ich kann da weiter machen, wo ich aufgeh�rt habe