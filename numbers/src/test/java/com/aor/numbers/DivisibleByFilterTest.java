package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisibleByFilterTest {
 DivisibleByFilter number = new DivisibleByFilter(1);
    @Test
    void accept(){
        Assertions.assertEquals(true,number.accept(3));
    }
}