package com.aor.designpattern;

public class StringCaseChanger implements StringTransformer {
    String CaseChanger( String a){
        String b = new String();
        char[] chars = a.toCharArray();
        for (char ch: chars) {
            if(Character.isLowerCase(ch) )Character.toUpperCase(ch);
            else Character.toLowerCase(ch);
            b+=ch;
        }
        return b;
    }
    @Override
    public void execute(StringDrink drink) {
        String b = new String();
        char[] chars = drink.getText().toCharArray();
        for (char ch: chars) {
            if(Character.isLowerCase(ch) )ch = Character.toUpperCase(ch);
            else ch = Character.toLowerCase(ch);
            b+=ch;
        }
        drink.setText(b);
    }
    @Override
    public void undo(StringDrink drink){
        execute(drink);
    }
}

