package test.java.pokerhand;

import main.java.pokerhand.Hand;
import main.java.pokerhand.PokerCard;

import static kotlin.test.AssertionsKt.assertTrue;

public class TestPokerCard {

    private final PokerCard pokerCard;
    Hand cardHand = new Hand();

    public TestPokerCard (PokerCard pokerCard) {
        this.pokerCard = pokerCard;
    }

    public void isValidHandTrue(){
        boolean resultPlayerTwo = this.pokerCard.countValidHandPlayerTwo(cardHand.inputPlayerOne);
        boolean resultPlayerOne = this.pokerCard.countValidHandPlayerOne(cardHand.inputPlayerTwo);
        assertTrue(true, String.valueOf(resultPlayerOne));
        assertTrue(true, String.valueOf(resultPlayerTwo));
    }

    public void isValidFaceTrue(){
        boolean resultPlayerTwo = this.pokerCard.analyzeFace((Hand) hand);
        boolean resultPlayerOne = this.pokerCard.analyzeFace((Hand) hand);
        assertTrue(true, String.valueOf(resultPlayerOne));
        assertTrue(true, String.valueOf(resultPlayerTwo));
    }

    public void DifferentRank_FirstHandHasStraightFlushSecondHandHasFourOfAKind(){
        int expected = -1;
        int result = this.pokerCard.compareHands();
    }
}

