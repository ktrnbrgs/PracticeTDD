package main.java;

import java.util.List;

public class PokerHand {

    public boolean pairCard(List<String> cardTest) {
        String tmp = "";
        for(String card : cardTest){
          while(tmp != "") {
              if ((String.valueOf(tmp.indexOf(1))).equals(String.valueOf(card.indexOf(1)))) {
                  return true;
              }
          }
          tmp = card;
        }
        return false;
    }
}
