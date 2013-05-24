Wenn(/^ich den Spielanleitungs\-Button klicke$/) do
    touch("* id:'start' button id:'btn_anleitung'")
end

Dann (/^ich kann von dort zum Spielmodus\-Bildschirm navigieren$/) do
    touch("* id:'anleitung' button id:'btn_start'")
    query("* id:'modus' button id:'btn_einspieler'")
    query("* id:'modus' button id:'btn_mehrspieler'")
end