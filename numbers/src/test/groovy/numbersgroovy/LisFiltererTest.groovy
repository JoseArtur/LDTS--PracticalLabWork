package numbersgroovy;

import com.aor.numbers.GenericListFilter;
import com.aor.numbers.ListFilterer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito
import spock.lang.Specification;

import java.util.Arrays;
import java.util.List;

 class LisFiltererTest extends Specification {

    def "filter"() {
        given:
        def expected = Arrays.asList(1,3)
        def list = Arrays.asList(0,1,3)
        def a = Mock(GenericListFilter)
        a.accept(1)>>true
        a.accept(0)>>false
        a.accept(3)>>true
        def filtered = new ListFilterer(a)
        when:
        def filteredr = filtered.filter(list)
        then:
        filteredr==expected
    }
}
