package com.aor.designpattern;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class StringDrinkTest {

    @Test
    public void stringDrink() {
        StringDrink drink = new StringDrink("ABCD");
        assertEquals("ABCD", drink.getText());
        drink.setText("DCBA");
        assertEquals("DCBA", drink.getText());
    }


}