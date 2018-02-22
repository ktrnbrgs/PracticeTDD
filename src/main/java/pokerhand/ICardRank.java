package main.java.pokerhand;

public class ICardRank {
    private int CheckHandRank(Hand hand)
    {
        int handRank = 0;

        if (this.IsStraightFlush(hand) == true)
        {
            handRank = (int)CardRank.IsStraightFlushRank;
        }
        else if (this.IsFourOfAKind(hand) == true)
        {
            handRank = (int)CardRank.IsFourOfAKindRank;
        }
        else if (this.IsFullHouse(hand) == true)
        {
            handRank = (int)CardRank.IsFullHouseRank;
        }
        else if (this.IsFlush(hand) == true)
        {
            handRank = (int)CardRank.IsFlushRank;
        }
        else if (this.IsStraight(hand) == true)
        {
            handRank = (int)CardRank.IsStraightRank;
        }
        else if (this.IsThreeOfAKind(hand) == true)
        {
            handRank = (int)CardRank.IsThreeOfAKindRank;
        }
        else if (this.IsTwoPair(hand) == true)
        {
            handRank = (int)CardRank.IsTwoPairRank;
        }
        else if (this.IsOnePair(hand) == true)
        {
            handRank = (int)CardRank.IsOnePairRank;
        }
        else if (this.IsHighCard(hand) == true)
        {
            handRank = (int)CardRank.IsHighCardRank;
        }

        return handRank;
    }
}
