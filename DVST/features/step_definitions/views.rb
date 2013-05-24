#anleitung lesen
Angenommen(/^ich befinde mich auf dem Start\-Bildschirm$/) do
    query("* id:'start' button id:'btn_start'")
    query("* id:'start' button id:'btn_anleitung'")
end

Dann(/^oeffnet sich der Anleitungs\-Bildschirm$/) do
    query("* id:'anleitung'")
end

#spielmodus waehlen
Angenommen(/^ich befinde mich auf dem Spielmodus\-Bildschirm$/) do
    query("* id:'start'")
    touch("* button id:'btn_start'")
    query("* id:'modus' button id:'btn_einspieler'")
    query("* id:'modus' button id:'btn_mehrspieler'")
end

Dann(/^gelange ich zum Figurwahl\-Bildschirm$/) do
    query("* id:'spielfigur'")
end

Dann(/^gelange ich zum "(.*?)"$/) do |arg1|
    if @arg1 == 'Spieler-Einfuege-Bildschirm' then
        query("* id:'spieler_uebersicht' button id:'btn_neu'")
        query("* id:'spieler_uebersicht' button id:'btn_modus_wechseln'")
        query("* id:'spieler_uebersicht' button id:'btn_zum_spiel'")
        elsif @arg1 == 'Verbindungsaufbau-Bildschirm' then
        # query("* id:'server'")
    end
end

#spieler_einfuegen
Angenommen(/^ich befinde mich auf dem Spieler\-Einfuege\-Bildschirm$/) do
    query("* id:'start'")
    touch("* button id:'btn_start'")
    query("* id:'modus'")
    touch("* button id:'btn_mehrspieler'")
    query("* id:'geraete'")
    choose('rb_eins')
    touch("* button id:'btn_ok'")
    query("* id:'spieler_uebersicht' button id:''btn_neu")
    query("* id:'spieler_uebersicht' button id:''btn_modus_wechseln")
    query("* id:'spieler_uebersicht' button id:''btn_zum_spiel")
end

Dann(/^zeigt mir das System den Figurwahl\-Bildschirm$/) do
    query("* id:'spieler_einfuegen' spinner id:'spin_farbe'")
    query("* id:'spieler_einfuegen' spinner id:'spin_figur'")
    query("* id:'spieler_einfuegen button id:'btn_erstellen''")
end

Dann(/^komme ich wieder auf den Spieler\-Einfuege\-Bildschirm$/) do
    query("* id:'spieler_einfuegen'")
    query("* id:'spieler_einfuegen' textview id:'hd_spieler'")
end