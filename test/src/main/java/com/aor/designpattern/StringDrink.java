package com.aor.designpattern;

public class StringDrink {
    private String str;
    public  StringDrink(String str){
        this.str = str;
    }

String getText(){
        return str;
}
void setText(String newText){
        str = newText;
}

}
