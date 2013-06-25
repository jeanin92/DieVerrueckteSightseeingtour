Wenn(/^ich das Spiel beende$/) do
    touch("* id:'spielbildschirm' button id:'btn_beenden'")
end

Dann (/^wird das Spiel mit all seinen Daten geloescht und ich gelange auf den Spielmodus\-Bildschirm$/) do
    query("* id:'modus' button id:'btn_einspieler'")
    query("* id:'modus' button id:'btn_mehrspieler'")
end