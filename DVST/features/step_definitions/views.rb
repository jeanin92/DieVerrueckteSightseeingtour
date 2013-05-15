Angenommen(/^ich befinde mich auf dem Spielmodus\-Bildschirm$/) do
    query("* id:'start'")
    query("* id:'start' button text:'Spiel starten' isEnabled:true")
    query("* id:'start'button text:'Anleitung lesen' isEnabled:true")
    performAction('assert_text', 'Startseite', true)
    performAction('press_button_with_text', 'Spiel starten')
    query("* id:'modus'")
    query("* id:'modus' button text:'Einspieler' isEnabled:false")
    query("* id:'modus' button text:'button text:'Mehrspieler' isEnabled:true")
    performAction('assert_text', 'Spielmodus auswaehlen', true)
end

Dann(/^gelange ich zum Figurwahl\-Bildschirm$/) do
    query("* id:'spielfigur'")
    #performAction('assert_text', '???', true)
    #Farbe wählen
    #Figur wählen
    #Namen eingeben
end

Dann(/^gelange ich zum "(.*?)"$/) do |arg1|
    if @arg1 == 'Spieler-Einfuege-Bildschirm' then
         query("* id:'spieler_uebersicht'")
    elsif @arg1 == 'Verbindungsaufbau-Bildschirm' then
        # query("* id:'server'")
    end
end