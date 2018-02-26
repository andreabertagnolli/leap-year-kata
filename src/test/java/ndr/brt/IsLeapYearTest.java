package ndr.brt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsLeapYearTest {
    @Test
    void typical_common_year_not_leap_year() {
        IsLeapYear isLeapYear = new IsLeapYear();

        assertFalse(isLeapYear.test(2001));
    }

    @Test
    void typical_leap_year() {
        IsLeapYear isLeapYear = new IsLeapYear();

        assertTrue(isLeapYear.test(1996));
    }
}
