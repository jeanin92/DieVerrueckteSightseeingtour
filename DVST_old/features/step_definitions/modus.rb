Wenn(/^ich mich fuer ein Einspieler\-Spiel entscheide$/) do
    performAction('press_button_with_text', 'Einspieler')
end

Wenn(/^ich mich fuer ein Mehrspieler\-Spiel entscheide$/) do
    performAction('press_button_with_text', 'Mehrspieler')
end