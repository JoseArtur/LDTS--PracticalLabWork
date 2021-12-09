package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class PositiveFilterTest {
    PositiveFilter number = new PositiveFilter();
    @Test
    void accept(){
        Assertions.assertEquals(false,number.accept(0));
    }
}

