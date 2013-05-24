Wenn(/^ich dem System sage, dass ich einen Spieler anlegen moechte$/) do
    touch("* button id:'btn_neu'")
end

Dann(/^ich gebe die benoetigten Daten ein$/) do
    performAction('enter_text_into_id_field', 'Ich', 'et_name')
end

Dann(/^der Spieler wird als neuer Spielteilnehmer angezeigt$/) do
    performAction('assert_text','Ich', true)
    query("* button id:'btn_neu'")
    query("* listview id:'lv_spieler' imageview id:'img_gewaehlte_figur'")
    query("* listview id:'lv_spieler' button id:''btn_spieler_bearbeiten")
    query("* listview id:'lv_spieler' button id:''btn_spieler_loeschen")
end

Dann(/^ich will "(.*?)"$/) do |arg1|
    pending # express the regexp above with the code you wish you had
end

Dann(/^sagt mir das System, "(.*?)"$/) do |arg1|
    pending # express the regexp above with the code you wish you had
end

Dann(/^ich befinde mich auf dem Figurwahl\-Bildschirm$/) do
    pending # express the regexp above with the code you wish you had
end

Dann(/^ich darf Name, Farbe und Form eingeben$/) do
    pending # express the regexp above with the code you wish you had
end

Dann(/^ich sage dem System, dass ich doch keinen neuen Spieler moechte$/) do
    pending # express the regexp above with the code you wish you had
end

Dann(/^fragt mich das System, ob ich mir sicher bin$/) do
    pending # express the regexp above with the code you wish you had
end

Dann(/^ich sage "(.*?)"$/) do |arg1|
    pending # express the regexp above with the code you wish you had
end

Dann(/^ich befinde mich auf dem "(.*?)"$/) do |arg1|
    pending # express the regexp above with the code you wish you had
end