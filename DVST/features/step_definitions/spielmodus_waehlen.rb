require 'calabash-android/calabash_steps'

Wenn(/^ich mich fuer ein Einspieler\-Spiel entscheide$/) do
    performAction('press_button_with_text', 'Einspieler')
end

Wenn(/^ich mich fuer ein Mehrspieler\-Spiel entscheide$/) do
    performAction('press_button_with_text', 'Mehrspieler')
end

Dann(/^fragt mich das System auf wie vielen Geraeten ich spielen moechte$/) do
    performAction('assert_text', 'Geraeteanzahl', true)
end

Wenn(/^$ich sage, ich moechte auf einem Geraet spielen/) do
    #radio button 1 Geraet ausgewaehlt
    performAction('press_button_with_text', 'Okay')
end

Wenn(/^$ich sage, ich moechte auf mehreren Geraeten spielen/) do
    pending #radio button mehrere Geraete ausgewaehlt
    pending #performAction('press_button_with_text', 'Okay')
end

Angenommen(/^ich befinde mich auf dem Spielmodus\-Bildschirm$/) do
    performAction('press_button_with_text', 'Spiel starten')
    performAction('assert_text', 'Spielmodus auswaehlen', true)
end

Dann(/^gelange ich zum Figurwahl\-Bildschirm$/) do
    pending #performAction('assert_text', 'Figur', true)
end

Dann(/^gelange ich zum Spieler\-Einfuege\-Bildschirm$/) do
    # performAction('assert_text', 'Spieler hinzufuegen', true)
end

Dann(/^gelange ich zum Verbindungsaufbau\-Bildschirm$/) do
    pending #performAction('assert_text', 'Server', true)
end
