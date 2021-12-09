package com.aor.designpattern;

public class StringInverter implements StringTransformer{

    @Override
    public void execute(StringDrink drink) {
        StringBuilder ss = new StringBuilder(drink.getText());
        ss.reverse();
          drink.setText(ss.toString());
    }
    @Override
    public void undo(StringDrink drink){
        execute(drink);

    }
}
