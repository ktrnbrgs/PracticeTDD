package main.java;

import main.java.KarateChop;
import org.junit.Test;

import static org.junit.Assert.*;


public class TestKarateChop {
    KarateChop search = new KarateChop();
    public TestKarateChop(){

    }

    @Test
    public void searchValuesByIndex(){
        int values [] = {1, 2, 3, 4};
        assertEquals(0, search.chop(1, values));
    }

    @Test
    public void searchValuesIfInTheTopOrBottomOfArray(){
        int values [] = {1, 2, 3, 4, 5};
        assertEquals(-1, search.chopValues(9, values));
    }


}
