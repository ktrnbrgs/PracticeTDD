package main.java.poker;

import java.lang.System;

import static main.java.poker.CardNum.Clubs;

public class CCard implements Card {
    private int MAX_CARD_FASE_AS_NUMBER = (int) CardFace.Ten;

    public CCard(CardFace face, CardNum num) {
        this.face = face;
        this.num = num;
    }

    public CardFace face { get; private set; }
    public CardNum num { get; private set; }

    private @Override String ToString()
    {
        int cardFaceNumber = (int)this.face;
        String cardFace = String.Empty;

        if (cardFaceNumber <= MAX_CARD_FASE_AS_NUMBER)
        {
            cardFace = cardFaceNumber.ToString();
        }
        else
        {
            // Get first letter from card
            cardFace = this.face.ToString()[0].ToString();
        }

        switch (this.num)
        {
            case CardNum.Clubs:
                cardFace += "♣";
                break;
            case CardNum.Diamonds:
                cardFace += "♦";
                break;
            case CardNum.Hearts:
                cardFace += "♥";
                break;
            case CardNum.Spades:
                cardFace += "♠";
                break;
            default:
                throw new InvalidOperationException("Invalid suit: " + this.num);
        }

        return cardFace;
    }
}
