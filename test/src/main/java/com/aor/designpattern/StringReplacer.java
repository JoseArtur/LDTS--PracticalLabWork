package com.aor.designpattern;

public class StringReplacer implements StringTransformer{
    char a,b;
    public  StringReplacer(char a, char b){
        this.a = a;
        this.b = b;
    }
    @Override
    public void execute(StringDrink drink) {
         drink.setText(drink.getText().replace(a,b)) ;
    }
    @Override
    public void undo(StringDrink drink){
        drink.setText(drink.getText().replace(b,a));
    }
}
