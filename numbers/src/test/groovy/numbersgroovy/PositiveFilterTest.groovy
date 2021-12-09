package numbersgroovy;

import com.aor.numbers.PositiveFilter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test
import spock.lang.Specification;


 class PositiveFilterTest extends Specification {
     def number = new PositiveFilter()

    def "accept"(){
        when:
        boolean a =number.accept(0)
        then:
        a ==false
    }
}

