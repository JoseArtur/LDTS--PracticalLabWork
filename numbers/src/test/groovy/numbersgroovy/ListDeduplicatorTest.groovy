package numbersgroovy;

import com.aor.numbers.GenericListSorter;
import com.aor.numbers.ListDeduplicator;
import com.aor.numbers.ListSorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito
import spock.lang.Specification;

import java.util.Arrays;
import java.util.List;

 class ListDeduplicatorTest extends Specification{
     private def helperr;
     def setup(){
         helperr  = Arrays.asList(5,1,1,5,2)
     }

     def "deduplicate"() {
         given:
         def  expected = Arrays.asList(1,5,2)
         def expectedHelperr = Arrays.asList(1,1,2,5,5)
         def sorter = Mock(GenericListSorter)
         def deduplicator = new ListDeduplicator(new ListSorter())
         sorter.sort(helperr) >> expectedHelperr
         when:
         def distinct = deduplicator.deduplicate(helperr)
         then:
         expected == distinct
    }




}// como resolver o problema
