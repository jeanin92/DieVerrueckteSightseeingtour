Wenn(/^ich mich fuer ein Einspieler\-Spiel entscheide$/) do
    performAction('press_button_with_text', 'Singleplayer')
end

Wenn(/^ich mich fuer ein Mehrspieler\-Spiel entscheide$/) do
    performAction('press_button_with_text', 'Multiplayer')
end