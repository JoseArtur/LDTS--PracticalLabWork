package numbersgroovy


import com.aor.numbers.GenericListDeduplicator;
import com.aor.numbers.ListAggregator;
import com.aor.numbers.ListDeduplicator;
import com.aor.numbers.ListSorter;

import org.mockito.Mockito
import spock.lang.Specification;



  class TestListAggregatorr extends Specification{
    private def helperr;
      def setup(){
         helperr  = Arrays.asList(5,1,1,5,2)
      }
      def "sum"() {
        ListAggregator aggregator = new ListAggregator(new ListDeduplicator(new ListSorter()))
        when:
        int sum = aggregator.sum(helperr)
        then:
        sum ==14
    }


    def "max"() {

        ListAggregator aggregator = new ListAggregator(new ListDeduplicator(new ListSorter()))
        when:
        int max = aggregator.max(helperr);
        then:
        max==5

    }


     def "max_bug_7263"(){

        ListAggregator aggregator = new ListAggregator(new ListDeduplicator(new ListSorter()))
         when:
         int max = aggregator.max(helperr)
         then:
         max == 5

    }


    def "min"() {
        ListAggregator aggregator = new ListAggregator(new ListDeduplicator(new ListSorter()))
        when:
        int min = aggregator.min(helperr)
        then:
        min == 1
    }


    def "distinct"() {
        def deduplicator = Mock(GenericListDeduplicator)
        deduplicator.deduplicate(Arrays.asList(1, 2, 4, 2)) >> Arrays.asList(1, 2, 4)
        ListAggregator aggregator = new ListAggregator(new ListDeduplicator(new ListSorter()))
        when:
        int distinct = aggregator.distinct(helperr)
        then:
        distinct == 3
    }

}
