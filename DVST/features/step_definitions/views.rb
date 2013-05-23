Angenommen(/^ich befinde mich auf dem Spielmodus\-Bildschirm$/) do
    query("* id:'start'")
    query("* id:'start' button text:'Start game' isEnabled:true")
    query("* id:'start'button text:'Read instructions' isEnabled:true")
    performAction('press_button_with_text', 'Start game')
    query("* id:'modus'")
    query("* id:'modus' button text:'Singleplayer' isEnabled:false")
    query("* id:'modus' button text:'button text:'Multiplayer' isEnabled:true")
    performAction('assert_text', 'Choose gamemode', true)
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

Angenommen(/^ich befinde mich auf dem Start\-Bildschirm$/) do
  query("* id:'start'")
end

Wenn(/^ich den Spielanleitungs\-Button klicke$/) do
  performAction('press', 'btn_anleitung')
end

Dann(/^oeffnet sich der Anleitungs\-Bildschirm$/) do
  query("* id:'anleitung'")
end