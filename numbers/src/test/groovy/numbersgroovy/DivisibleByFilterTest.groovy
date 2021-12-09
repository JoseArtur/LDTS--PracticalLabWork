package numbersgroovy;

import com.aor.numbers.DivisibleByFilter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test
import spock.lang.Specification;

class DivisibleByFilterTest extends Specification {

    def number = new DivisibleByFilter(1)
    def "accept"(){
        when:
        boolean accepts = number.accept(3)
        then:
        accepts == true
    }
}