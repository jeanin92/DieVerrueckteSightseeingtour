require 'calabash-android/calabash_steps'

Angenommen(/^ich befinde mich auf dem Spielmodus\-Bildschirm$/) do
    performAction('press_button_with_text', 'Spiel starten')
    performAction('assert_text', 'Spielmodus', true)
end

Wenn(/^ich mich für ein Einspieler\-Spiel entscheide$/) do
    #pending # express the regexp above with the code you wish you had
end

Dann(/^gelange ich zum Figurwahl\-Bildschirm$/) do
    pending # express the regexp above with the code you wish you had
end

Wenn(/^ich mich für ein Mehrspieler\-Spiel entscheide$/) do
    pending # express the regexp above with the code you wish you had
end

Dann(/^fragt mich das System auf wie vielen Geräten ich spielen möchte$/) do
    pending # express the regexp above with the code you wish you had
end