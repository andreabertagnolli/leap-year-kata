package ndr.brt;

import java.util.function.Predicate;

class IsLeapYear implements Predicate<Integer> {

    public boolean test(Integer integer) {
        return integer % 4 == 0 && integer % 100 != 0;
    }

}
