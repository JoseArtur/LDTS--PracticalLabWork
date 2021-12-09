package com.aor.designpattern;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class StringInverterTest {
    @Test
    public void stringInverter() {
        StringDrink drink = new StringDrink("ABCD");
        StringInverter si = new StringInverter();
        si.execute(drink);
        assertEquals("DCBA", drink.getText());
    }

    private void execute(StringDrink drink) {
    }

}
