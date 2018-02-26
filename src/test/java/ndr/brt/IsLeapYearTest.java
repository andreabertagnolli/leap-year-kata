package ndr.brt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class IsLeapYearTest {
    @Test
    void typical_common_year_not_leap_year() {
        IsLeapYear isLeapYear = new IsLeapYear();

        assertFalse(isLeapYear.test(2001));
    }
}
