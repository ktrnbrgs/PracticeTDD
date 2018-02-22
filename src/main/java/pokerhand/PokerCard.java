package main.java.pokerhand;

import java.util.Arrays;
import java.util.HashSet;

public class PokerCard {

    final static String faces = "AKQJT98765432";
    final static String suits = "HDSC";
    final static String[] deck = buildDeck();

    private static String[] buildDeck() {
        String[] dck = new String[suits.length() * faces.length()];
        int i = 0;
        for (char s : suits.toCharArray()) {
            for (char f : faces.toCharArray()) {
                dck[i] = "" + f + s;
                i++;
            }
        }
        return dck;
    }

    public boolean countValidHandPlayerOne(Hand hand) {
        if (hand.inputPlayerOne.length != 5)
            return false;
        return false;
    }

    public boolean analyzeHandPlayerOne(Hand hand) {
        if (new HashSet<>(Arrays.asList(hand)).size() != hand.inputPlayerOne.length)
            return false;
        return true;
    }

    public boolean analyzeSuit(Hand hand){
        int[] faceCount = new int[faces.length()];
        long straight = 0, flush = 0;
        for (String card : hand.inputPlayerOne) {
            if (suits.indexOf(card.charAt(1)) == -1)
                return false;
            flush += (1 << card.charAt(1));
        }
        return true;
    }

    public boolean analyzeFace(Hand hand) {
        int[] faceCount = new int[faces.length()];
        long straight = 0, flush = 0;
        for (String card : hand.inputPlayerOne) {

            int face = faces.indexOf(card.charAt(0));
            if (face == -1)
                return false;
            straight += (1 << face);

            faceCount[face]++;
        }
        return true;
    }

    public boolean countValidHandPlayerTwo(Hand hand) {
        if (hand.inputPlayerTwo.length != 5)
            return false;
        return true;
    }

    public int compareHands(){
        return -1;
    }
}