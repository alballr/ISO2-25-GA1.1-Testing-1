import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class MyDateTest {

	
	// each use tests
	@Test
    public void eachUse_case1_0001_05_15_notLeap() throws InvalidDateException {
        MyDate d = new MyDate(15, 5, 1);
        assertFalse(d.isLeapYear());
    }

    @Test
    public void eachUse_case2_0000_00_00_invalid() {
        try {
            new MyDate(0, 0, 0);
            fail("Expected InvalidDateException");
        } catch (InvalidDateException e) {
        }
    }

    @Test
    public void eachUse_case3_0001_01_01_notLeap() throws InvalidDateException {
        MyDate d = new MyDate(1, 1, 1);
        assertFalse(d.isLeapYear());
    }

    @Test
    public void eachUse_case4_0001_11_27_notLeap() throws InvalidDateException {
        MyDate d = new MyDate(27, 11, 1);
        assertFalse(d.isLeapYear());
    }

    @Test
    public void eachUse_case5_2024_02_28_leapYear() throws InvalidDateException {
        MyDate d = new MyDate(28, 2, 2024);
        assertTrue(d.isLeapYear());
    }

    @Test
    public void eachUse_case6_0001_13_30_invalid() {
        try {
            new MyDate(30, 13, 1);
            fail("Expected InvalidDateException");
        } catch (InvalidDateException e) {
        }
    }

    @Test
    public void eachUse_case7_2024_14_31_invalid() {
        try {
            new MyDate(31, 14, 2024);
            fail("Expected InvalidDateException");
        } catch (InvalidDateException e) {
        }
    }

    
    // pairwise tests
    @Test
    public void pairwise_case1_2024_02_29_leap() throws InvalidDateException {
        MyDate d = new MyDate(29, 2, 2024);
        assertTrue(d.isLeapYear());
    }

    @Test
    public void pairwise_case2_0001_02_29_invalid() {
        try {
            new MyDate(29, 2, 1);
            fail("Expected InvalidDateException");
        } catch (InvalidDateException e) {
        }
    }

    @Test
    public void pairwise_case3_0001_04_31_invalid() {
        try {
            new MyDate(31, 4, 1);
            fail("Expected InvalidDateException");
        } catch (InvalidDateException e) {
        }
    }

    @Test
    public void pairwise_case4_2024_04_30_leap() throws InvalidDateException {
        MyDate d = new MyDate(30, 4, 2024);
        assertTrue(d.isLeapYear());
    }

    @Test
    public void pairwise_case5_0001_01_31_notLeap() throws InvalidDateException {
        MyDate d = new MyDate(31, 1, 1);
        assertFalse(d.isLeapYear());
    }

    @Test
    public void pairwise_case6_0000_05_15_invalid() {
        try {
            new MyDate(15, 5, 0);
            fail("Expected InvalidDateException");
        } catch (InvalidDateException e) {
        }
    }

    @Test
    public void pairwise_case7_0001_13_15_invalid() {
        try {
            new MyDate(15, 13, 1);
            fail("Expected InvalidDateException");
        } catch (InvalidDateException e) {
        }
    }

    @Test
    public void pairwise_case8_0001_05_33_invalid() {
        try {
            new MyDate(33, 5, 1);
            fail("Expected InvalidDateException");
        } catch (InvalidDateException e) {
        }
    }

    @Test
    public void pairwise_case9_0001_02_28_notLeap() throws InvalidDateException {
        MyDate d = new MyDate(28, 2, 1);
        assertFalse(d.isLeapYear());
    }

    @Test
    public void pairwise_case10_2024_05_02_leap() throws InvalidDateException {
        MyDate d = new MyDate(2, 5, 2024);
        assertTrue(d.isLeapYear());
    }

    // Decision coverage tests 

    @Test
    public void decision_case1_2004_02_29_leap() throws InvalidDateException {
        MyDate d = new MyDate(29, 2, 2004);
        assertTrue(d.isLeapYear());
    }

    @Test
    public void decision_case2_2000_02_29_leap() throws InvalidDateException {
        MyDate d = new MyDate(29, 2, 2000);
        assertTrue(d.isLeapYear());
    }

    @Test
    public void decision_case3_2023_03_29_notLeap() throws InvalidDateException {
        MyDate d = new MyDate(29, 3, 2023);
        assertFalse(d.isLeapYear());
    }

    @Test
    public void decision_case4_2010_03_28_notLeap() throws InvalidDateException {
        MyDate d = new MyDate(28, 3, 2010);
        assertFalse(d.isLeapYear());
    }

    @Test
    public void decision_case5_1996_05_31_leap() throws InvalidDateException {
        MyDate d = new MyDate(31, 5, 1996);
        assertTrue(d.isLeapYear());
    }

    @Test
    public void decision_case6_2023_04_30_notLeap() throws InvalidDateException {
        MyDate d = new MyDate(30, 4, 2023);
        assertFalse(d.isLeapYear());
    }

    @Test
    public void decision_case7_2000_01_31_leap() throws InvalidDateException {
        MyDate d = new MyDate(31, 1, 2000);
        assertTrue(d.isLeapYear());
    }

    @Test
    public void decision_case8_1700_06_26_notLeap() throws InvalidDateException {
        MyDate d = new MyDate(26, 6, 1700);
        assertFalse(d.isLeapYear());
    }

    // MC/DC tests

    @Test
    public void mcdc_case1_2000_divisibleBy400_true() throws InvalidDateException {
        MyDate d = new MyDate(1, 1, 2000);
        assertTrue(d.isLeapYear());
    }

    @Test
    public void mcdc_case2_1900_divisibleBy100_not400_false() throws InvalidDateException {
        MyDate d = new MyDate(1, 1, 1900);
        assertFalse(d.isLeapYear());
    }

    @Test
    public void mcdc_case3_2016_divisibleBy4_not100_true() throws InvalidDateException {
        MyDate d = new MyDate(1, 1, 2016);
        assertTrue(d.isLeapYear());
    }

    @Test
    public void mcdc_case4_2017_notDivisibleBy4_false() throws InvalidDateException {
        MyDate d = new MyDate(1, 1, 2017);
        assertFalse(d.isLeapYear());
    }
}
