Dann(/^fragt mich das System auf wie vielen Geraeten ich spielen moechte$/) do
    query("* id:'geraete' button id:'Okay'")
    query("* id:'geraete' id:'rb_eins'")
    query("* id:'geraete' id:'rb_zwei'")
end

Wenn(/^ich sage, ich moechte auf "(.*?)" spielen$/) do |arg1|
    if @arg1 == 'einem Geraet' then
        choose('rb_eins')
        touch("* id:'btn_ok'")
    elsif @arg1 == 'mehreren Geraeten' then
        #pending choose('rb_mehrere')
        touch("* id:'btn_ok'")
    end
end