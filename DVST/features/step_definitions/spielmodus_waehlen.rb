require 'calabash-android/calabash_steps'

Wenn(/^ich mich für ein Einspieler\-Spiel entscheide$/) do
    performAction('press_button_with_text', 'Einspieler')
end

Wenn(/^ich mich für ein Mehrspieler\-Spiel entscheide$/) do
    performAction('press_button_with_text', 'Mehrspieler')
end

Dann(/^fragt mich das System auf wie vielen Geräten ich spielen möchte$/) do
    performAction('assert_text', 'Geräteanzahl', true)
end

Wenn(/^$ich sage, ich möchte auf einem Gerät spielen/) do
    #radio button 1 Gerät ausgewählt
    performAction('press_button_with_text', 'Okay')
end

Wenn(/^$ich sage, ich möchte auf mehreren Geräten spielen/) do
    pending #radio button mehrere Geräte ausgewählt
    pending #performAction('press_button_with_text', 'Okay')
end

Angenommen(/^ich befinde mich auf dem Spielmodus\-Bildschirm$/) do
    performAction('press_button_with_text', 'Spiel starten')
    performAction('assert_text', 'Spielmodus auswählen', true)
end

Dann(/^gelange ich zum Figurwahl\-Bildschirm$/) do
    pending #performAction('assert_text', 'Figur', true)
end

Dann(/^gelange ich zum Spieler\-Einfüge\-Bildschirm$/) do
    # performAction('assert_text', 'Spieler hinzufügen', true)
end

Dann(/^gelange ich zum Verbindungsaufbau\-Bildschirm$/) do
    pending #performAction('assert_text', 'Server', true)
end