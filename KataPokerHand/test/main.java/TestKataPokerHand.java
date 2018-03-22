package main.java;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TestKataPokerHand {
    PokerHand pokerhand = new PokerHand();

    @Test
    public void havePairCard(){
        //List<String> cardExpected = Arrays.asList("2H", "2H");
        List<String> cardTest = Arrays.asList("2H", "1H", "3D", "5S", "9C");
        assertEquals(true, pokerhand.pairCard(cardTest));
    }


}
