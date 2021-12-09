package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class LisFiltererTest {
    @Test
    public void filter() {
        List<Integer> expected = Arrays.asList(1,3);
        List<Integer> list = Arrays.asList(0,1,3);

        GenericListFilter a = Mockito.mock(GenericListFilter.class);
        Mockito.when(a.accept(1) ).thenReturn(true);
        Mockito.when(a.accept(0)).thenReturn(false);
        Mockito.when(a.accept(3)).thenReturn(true);
        ListFilterer filtered = new ListFilterer(a);
        Assertions.assertEquals(expected, filtered.filter(list));
    }
}
