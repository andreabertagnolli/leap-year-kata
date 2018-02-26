package ndr.brt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsLeapYearTest {

    private IsLeapYear isLeapYear = new IsLeapYear();

    @Test
    void typical_common_year() {
        assertFalse(isLeapYear.test(2001));
    }

    @Test
    void typical_leap_year() {
        assertTrue(isLeapYear.test(1996));
    }

    @Test
    void atypical_leap_year() {
        assertFalse(isLeapYear.test(1900));
    }
}
