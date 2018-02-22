package main.java.poker;

using System;
using System.Collections.Generic;
using System.Text;

public class CHand implements Hand {
    private const int CARDS_IN_HAND = 5;

    public CHand(IList<Card> cards)
    {
        if (cards.Count < CARDS_IN_HAND || cards.Count > CARDS_IN_HAND)
        {
            throw new ArgumentOutOfRangeException("Player hand cannot contains less or more than 5 cards!");
        }

        this.Cards = cards;
    }

    public IList<Card> Cards { get; private set; }

    public override string ToString()
    {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < this.Cards.Count; i++)
        {
            if (i == this.Cards.Count - 1)
            {
                builder.Append(this.Cards[i]);
            }
            else
            {
                builder.Append(this.Cards[i] + " ");
            }
        }

        return builder.ToString();
    }
}
