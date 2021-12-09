package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;
public class ListDeduplicatorTest {
    List<Integer> helperr;
    @BeforeEach
    private void helperr() {
        Integer[] ints = new Integer[] {5,1,1,5,2};
        helperr = Arrays.asList(ints);

    }
    @Test
    public void deduplicate() {
        List<Integer> expected = Arrays.asList(1,5,2);
        GenericListSorter sorter = Mockito.mock(GenericListSorter.class);
        Mockito.when(sorter.sort(helperr)).thenReturn(Arrays.asList(1,1,2,5,5));
        /*class TestListSorter implements GenericListSorter{

            @Override
            public List<Integer> sort(List<Integer> list) {return Arrays.asList(1,1,2,5,5);}
        }

         */
        ListDeduplicator deduplicator = new ListDeduplicator(new ListSorter());
        List<Integer> distinct = deduplicator.deduplicate(helperr);
        Assertions.assertEquals(expected, distinct);
    }




}// como resolver o problema
