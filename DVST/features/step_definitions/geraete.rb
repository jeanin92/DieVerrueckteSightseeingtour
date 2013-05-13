Dann(/^fragt mich das System auf wie vielen Geraeten ich spielen moechte$/) do
    query("* id:'geraete' button text='Okay'")
    #radio buttons
    performAction('assert_text', 'Geraeteanzahl', true)
end

Wenn(/^$ich sage, ich moechte auf einem Geraet spielen/) do
    #radio button 1 Geraet ausgewaehlt
    performAction('press_button_with_text', 'Okay')
end

Wenn(/^$ich sage, ich moechte auf mehreren Geraeten spielen/) do
    pending #radio button mehrere Geraete ausgewaehlt
    performAction('press_button_with_text', 'Okay')
end