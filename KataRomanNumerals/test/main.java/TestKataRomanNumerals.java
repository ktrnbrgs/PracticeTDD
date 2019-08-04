package main.java;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestKataRomanNumerals {

    @Test
    public void givenArabicNumber1ConvertToRomanNumberI(){
        RomanNumeral romanNumeral = new RomanNumeral();
        assertThat("XXII", is(romanNumeral.getRomanValue(22)));
    }

    @Test
    public void givenRomanNumeralIConvertToArabicNumber(){
        ArabicNumeral romanNumeral = new ArabicNumeral();
        assertThat(1, is(romanNumeral.getArabicValue("I")));
    }

}
