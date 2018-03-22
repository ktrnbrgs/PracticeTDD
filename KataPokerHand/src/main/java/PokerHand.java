package main.java;

import java.util.List;

public class PokerHand {

    public boolean pairCard(List<String> cardTest) {
        String tmp = "1K";
        for(String card : cardTest){
            if((String.valueOf(tmp.charAt(1))).equals(String.valueOf(card.charAt(1)))){
                return true;
            }
            tmp = card;
        }
        return false;
    }
}
