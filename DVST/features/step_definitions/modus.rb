Wenn(/^ich mich fuer ein Einspieler\-Spiel entscheide$/) do
    touch("* id:'modus' button id:'btn_einspieler'")
end

Wenn(/^ich mich fuer ein Mehrspieler\-Spiel entscheide$/) do
    touch("* id:'modus' button id:'btn_mehrspieler'")
end