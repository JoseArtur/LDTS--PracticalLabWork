package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class ListAggregatorTest{
    List<Integer> helperr;

// Assembler class (the ListAggregatorTest ) is responsible for
//creating the concrete service (the ListDeduplicator ) and injecting it into the client
//(the ListAggregator )

    @BeforeEach
    private void helperr() {
        Integer[] ints = new Integer[] {5,1,1,5,2};
        helperr = Arrays.asList(ints);

    }
    @Test
    public void sum() {
        ListAggregator aggregator = new ListAggregator(new ListDeduplicator(new ListSorter()));

        int sum = aggregator.sum(helperr);

        Assertions.assertEquals(14, sum);
    }

    @Test
    public void max() {

        ListAggregator aggregator = new ListAggregator(new ListDeduplicator(new ListSorter()));
        int max = aggregator.max(helperr);

        Assertions.assertEquals(5, max);
    }

    @Test
    public void max_bug_7263(){
        List<Integer> list = Arrays.asList(-1,-4,-5);
        ListAggregator aggregator = new ListAggregator(new ListDeduplicator(new ListSorter()));
        Assertions.assertEquals(-1, aggregator.max(list));

    }

    @Test
    public void min() {
        List<Integer> list = Arrays.asList(1,2,4,2,5);

        ListAggregator aggregator = new ListAggregator(new ListDeduplicator(new ListSorter()));
        int min = aggregator.min(list);

        Assertions.assertEquals(1, min);
    }

    @Test
    public void distinct() {
        GenericListDeduplicator deduplicator = Mockito.mock(GenericListDeduplicator.class);
        Mockito.when(deduplicator.deduplicate(Mockito.anyList())).thenReturn(Arrays.asList(1, 2, 4));
        /*List<Integer> list = Arrays.asList(1,2,4,2);

        class TestListDeduplicator implements GenericListDeduplicator{

            @Override
            public List<Integer> deduplicate(List<Integer> list) {
                return Arrays.asList(1,2,4);
            }
        }*/
        ListAggregator aggregator = new ListAggregator(new ListDeduplicator(new ListSorter()));
        int distinct = aggregator.distinct(helperr);
        Assertions.assertEquals(3, distinct);
    }

}
