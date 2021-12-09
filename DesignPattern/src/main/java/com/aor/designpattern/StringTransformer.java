package com.aor.designpattern;

public interface StringTransformer {
    void execute(StringDrink drink);
    void undo(StringDrink drink);
}
