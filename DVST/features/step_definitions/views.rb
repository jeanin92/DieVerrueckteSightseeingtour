Angenommen(/^ich befinde mich auf dem Spielmodus\-Bildschirm$/) do
    query("* id:'start' button text:'Spiel starten' button text:'Anleitung lesen'")
    performAction('assert_text', 'Startseite', true)
    performAction('press_button_with_text', 'Spiel starten')
    query("* id:'modus' button text:'Einspieler' button text:'Mehrspieler'")
    performAction('assert_text', 'Spielmodus auswaehlen', true)
end

Dann(/^gelange ich zum Figurwahl\-Bildschirm$/) do
    pending
    #query("* id:'spielfigur'")
    #performAction('assert_text', '???', true)
    #Farbe wählen
    #Figur wählen
    #Namen eingeben
end

Dann(/^gelange ich zum Spieler\-Einfuege\-Bildschirm$/) do
    pending #query("* id:'spieler_uebersicht'")
    # performAction('assert_text', 'Spieler hinzufuegen', true)
end

Dann(/^gelange ich zum Verbindungsaufbau\-Bildschirm$/) do
    pending #performAction('assert_text', 'Server', true)
end