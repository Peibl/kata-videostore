package com.cleancode.martinfowler.videostore;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralTest {

    private RomanNumeral romanNumeral = new RomanNumeral();

    @Test
    public void testI() {
        assertEquals("I", romanNumeral.convertNumber(1));
        assertEquals("II", romanNumeral.convertNumber(2));
        assertEquals("III", romanNumeral.convertNumber(3));
        assertEquals("IV", romanNumeral.convertNumber(4));
        assertEquals("V", romanNumeral.convertNumber(5));
        assertEquals("VI", romanNumeral.convertNumber(6));
        assertEquals("VII", romanNumeral.convertNumber(7));
        assertEquals("VIII", romanNumeral.convertNumber(8));
        assertEquals("IX", romanNumeral.convertNumber(9));
    }

    @Test
    public void testX() {
        assertEquals("X", romanNumeral.convertNumber(10));
        assertEquals("XI", romanNumeral.convertNumber(11));
        assertEquals("XII", romanNumeral.convertNumber(12));
        assertEquals("XIII", romanNumeral.convertNumber(13));
        assertEquals("XIV", romanNumeral.convertNumber(14));
        assertEquals("XV", romanNumeral.convertNumber(15));
        assertEquals("XVI", romanNumeral.convertNumber(16));
        assertEquals("XVII", romanNumeral.convertNumber(17));
        assertEquals("XVIII", romanNumeral.convertNumber(18));
        assertEquals("XIX", romanNumeral.convertNumber(19));
    }

    @Test
    public void testXX() {
        assertEquals("XX", romanNumeral.convertNumber(20));
        assertEquals("XXI", romanNumeral.convertNumber(21));
        assertEquals("XXII", romanNumeral.convertNumber(22));
        assertEquals("XXIII", romanNumeral.convertNumber(23));
        assertEquals("XXIV", romanNumeral.convertNumber(24));
        assertEquals("XXV", romanNumeral.convertNumber(25));
        assertEquals("XXVI", romanNumeral.convertNumber(26));
        assertEquals("XXVII", romanNumeral.convertNumber(27));
        assertEquals("XXVIII", romanNumeral.convertNumber(28));
        assertEquals("XXIX", romanNumeral.convertNumber(29));
    }

    @Test
    public void testXXX() {
        assertEquals("XXX", romanNumeral.convertNumber(30));
        assertEquals("XXXI", romanNumeral.convertNumber(31));
        assertEquals("XXXII", romanNumeral.convertNumber(32));
        assertEquals("XXXIII", romanNumeral.convertNumber(33));
        assertEquals("XXXIV", romanNumeral.convertNumber(34));
        assertEquals("XXXV", romanNumeral.convertNumber(35));
        assertEquals("XXXVI", romanNumeral.convertNumber(36));
        assertEquals("XXXVII", romanNumeral.convertNumber(37));
        assertEquals("XXXVIII", romanNumeral.convertNumber(38));
        assertEquals("XXXIX", romanNumeral.convertNumber(39));
    }

    @Test
    public void testXL() {
        assertEquals("XL", romanNumeral.convertNumber(40));
        assertEquals("XLI", romanNumeral.convertNumber(41));
        assertEquals("XLII", romanNumeral.convertNumber(42));
        assertEquals("XLIII", romanNumeral.convertNumber(43));
        assertEquals("XLIV", romanNumeral.convertNumber(44));
        assertEquals("XLV", romanNumeral.convertNumber(45));
        assertEquals("XLVI", romanNumeral.convertNumber(46));
        assertEquals("XLVII", romanNumeral.convertNumber(47));
        assertEquals("XLVIII", romanNumeral.convertNumber(48));
        assertEquals("XLIX", romanNumeral.convertNumber(49));
    }

    @Test
    public void testL() {
        assertEquals("L", romanNumeral.convertNumber(50));
        assertEquals("LI", romanNumeral.convertNumber(51));
        assertEquals("LII", romanNumeral.convertNumber(52));
        assertEquals("LIII", romanNumeral.convertNumber(53));
        assertEquals("LIV", romanNumeral.convertNumber(54));
        assertEquals("LV", romanNumeral.convertNumber(55));
        assertEquals("LVI", romanNumeral.convertNumber(56));
        assertEquals("LVII", romanNumeral.convertNumber(57));
        assertEquals("LVIII", romanNumeral.convertNumber(58));
        assertEquals("LIX", romanNumeral.convertNumber(59));
    }

    @Test
    public void testLX() {
        assertEquals("LX", romanNumeral.convertNumber(60));
        assertEquals("LXI", romanNumeral.convertNumber(61));
        assertEquals("LXII", romanNumeral.convertNumber(62));
        assertEquals("LXIII", romanNumeral.convertNumber(63));
        assertEquals("LXIV", romanNumeral.convertNumber(64));
        assertEquals("LXV", romanNumeral.convertNumber(65));
        assertEquals("LXVI", romanNumeral.convertNumber(66));
        assertEquals("LXVII", romanNumeral.convertNumber(67));
        assertEquals("LXVIII", romanNumeral.convertNumber(68));
        assertEquals("LXIX", romanNumeral.convertNumber(69));
    }

    @Test
    public void testLXXVIII() {
        assertEquals("LXXVIII", romanNumeral.convertNumber(78));
    }

    @Test
    public void testDCCIV() {
        assertEquals("DCCIV", romanNumeral.convertNumber(704));
    }

}