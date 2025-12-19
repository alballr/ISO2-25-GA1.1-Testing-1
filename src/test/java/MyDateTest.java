import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class MyDateTest {

    @Test
    public void testMyDateConstructorAndLeapYear() throws InvalidDateException {

        // Case 1: year=1, month=5, day=15 -> valid, not leap year
        MyDate d1 = new MyDate(15, 5, 1);
        assertFalse(d1.isLeapYear());

        // Case 2: year=0, month=0, day=0 -> invalid date, exception expected
        try {
            new MyDate(0, 0, 0);
            fail("Expected InvalidDateException");
        } catch (InvalidDateException e) {
        }

        // Case 3: year=1, month=1, day=1 -> valid, not leap year
        MyDate d3 = new MyDate(1, 1, 1);
        assertFalse(d3.isLeapYear());

        // Case 4: year=1, month=11, day=27 -> valid, not leap year
        MyDate d4 = new MyDate(27, 11, 1);
        assertFalse(d4.isLeapYear());

        // Case 5: year=2024, month=2, day=28 -> valid, leap year
        MyDate d5 = new MyDate(28, 2, 2024);
        assertTrue(d5.isLeapYear());

        // Case 6: year=1, month=13, day=30 -> invalid date, exception expected
        try {
            new MyDate(30, 13, 1);
            fail("Expected InvalidDateException");
        } catch (InvalidDateException e) {
        }

        // Case 7: year=2024, month=14, day=31 -> invalid date, exception expected
        try {
            new MyDate(31, 14, 2024);
            fail("Expected InvalidDateException");
        } catch (InvalidDateException e) {
        }

        // Case 8: year=2024, month=2, day=29 -> valid, leap year
        MyDate d8 = new MyDate(29, 2, 2024);
        assertTrue(d8.isLeapYear());

        // Case 9: year=1, month=2, day=29 -> invalid date, exception expected
        try {
            new MyDate(29, 2, 1);
            fail("Expected InvalidDateException");
        } catch (InvalidDateException e) {
        }

        // Case 10: year=1, month=4, day=31 -> invalid date, exception expected
        try {
            new MyDate(31, 4, 1);
            fail("Expected InvalidDateException");
        } catch (InvalidDateException e) {
        }

        // Case 11: year=2024, month=4, day=30 -> valid, leap year
        MyDate d11 = new MyDate(30, 4, 2024);
        assertTrue(d11.isLeapYear());

        // Case 12: year=1, month=1, day=31 -> valid, not leap year
        MyDate d12 = new MyDate(31, 1, 1);
        assertFalse(d12.isLeapYear());

        // Case 13: year=0, month=5, day=15 -> invalid date, exception expected
        try {
            new MyDate(15, 5, 0);
            fail("Expected InvalidDateException");
        } catch (InvalidDateException e) {
        }

        // Case 14: year=1, month=13, day=15 -> invalid date, exception expected
        try {
            new MyDate(15, 13, 1);
            fail("Expected InvalidDateException");
        } catch (InvalidDateException e) {
        }

        // Case 15: year=1, month=5, day=33 -> invalid date, exception expected
        try {
            new MyDate(33, 5, 1);
            fail("Expected InvalidDateException");
        } catch (InvalidDateException e) {
        }

        // Case 16: year=1, month=2, day=28 -> valid, not leap year
        MyDate d16 = new MyDate(28, 2, 1);
        assertFalse(d16.isLeapYear());

        // Case 17: year=2024, month=5, day=2 -> valid, leap year
        MyDate d17 = new MyDate(2, 5, 2024);
        assertTrue(d17.isLeapYear());

        // Case 18: year=2004, month=2, day=29 -> valid, leap year
        MyDate d18 = new MyDate(29, 2, 2004);
        assertTrue(d18.isLeapYear());

        // Case 19: year=2000, month=2, day=29 -> valid, leap year
        MyDate d19 = new MyDate(29, 2, 2000);
        assertTrue(d19.isLeapYear());

        // Case 20: year=2023, month=3, day=29 -> valid, not leap year
        MyDate d20 = new MyDate(29, 3, 2023);
        assertFalse(d20.isLeapYear());

        // Case 21: year=2010, month=3, day=28 -> valid, not leap year
        MyDate d21 = new MyDate(28, 3, 2010);
        assertFalse(d21.isLeapYear());

        // Case 22: year=1996, month=5, day=31 -> valid, leap year
        MyDate d22 = new MyDate(31, 5, 1996);
        assertTrue(d22.isLeapYear());

        // Case 23: year=2023, month=4, day=30 -> valid, not leap year
        MyDate d23 = new MyDate(30, 4, 2023);
        assertFalse(d23.isLeapYear());

        // Case 24: year=2000, month=1, day=31 -> valid, leap year
        MyDate d24 = new MyDate(31, 1, 2000);
        assertTrue(d24.isLeapYear());

        // Case 25: year=1700, month=6, day=26 -> valid, not leap year
        MyDate d25 = new MyDate(26, 6, 1700);
        assertFalse(d25.isLeapYear());

        // Case 26: year=2000, month=1, day=1 -> valid, leap year
        MyDate d26 = new MyDate(1, 1, 2000);
        assertTrue(d26.isLeapYear());

        // Case 27: year=1900, month=1, day=1 -> valid, not leap year
        MyDate d27 = new MyDate(1, 1, 1900);
        assertFalse(d27.isLeapYear());

        // Case 28: year=2016, month=1, day=1 -> valid, leap year
        MyDate d28 = new MyDate(1, 1, 2016);
        assertTrue(d28.isLeapYear());

        // Case 29: year=2017, month=1, day=1 -> valid, not leap year
        MyDate d29 = new MyDate(1, 1, 2017);
        assertFalse(d29.isLeapYear());
    }
}
