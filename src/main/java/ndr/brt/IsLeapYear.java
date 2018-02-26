package ndr.brt;

import java.util.function.Predicate;

class IsLeapYear implements Predicate<Integer> {

    private Predicate<Integer> divisibleBy4 = it -> it % 4 == 0;
    private Predicate<Integer> divisibleBy100 = it -> it % 100 == 0;
    private Predicate<Integer> divisibleBy400 = it -> it % 400 == 0;

    public boolean test(Integer year) {
        return divisibleBy4.and(divisibleBy100.negate().or(divisibleBy400))
                .test(year);
    }

}
