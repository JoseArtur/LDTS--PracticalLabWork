package com.aor.designpattern;

import java.util.List;

public class StringRecipe {
    private List<StringTransformer> lt;
    public StringRecipe(List<StringTransformer> lt){
        this.lt =lt;
    }
    void mix(StringDrink drink){
        for(StringTransformer i:lt){
            i.execute(drink);
        }

    }
}
