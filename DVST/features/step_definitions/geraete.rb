Dann(/^fragt mich das System auf wie vielen Geraeten ich spielen moechte$/) do
    query("* id:'geraete' button text:'Okay' isEnabled:true")
    #radio buttons
    performAction('assert_text', 'Geraeteanzahl', true)
end

Wenn(/^ich sage, ich moechte auf "(.*?)" spielen$/) do |arg1|
    if @arg1 == 'einem Geraet' then
        #radio button 1 Geraet ausgewaehlt
        choose('rb_eins')
        performAction('press_button_with_text', 'Okay')
    elsif @arg1 == 'mehreren Geraeten' then
        #pending #radio button mehrere Geraete ausgewaehlt
        performAction('press_button_with_text', 'Okay')
    end
end