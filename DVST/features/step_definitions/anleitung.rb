Dann(/^ich kann von dort zum Spielmodus\-Bildschirm navigieren$/) do
  performAction('press', 'btn_start')
  query("* id:'modus'")
end