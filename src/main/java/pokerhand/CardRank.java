package main.java.pokerhand;

public enum CardRank {
        IsStraightFlushRank(9),
        IsFourOfAKindRank(8),
        IsFullHouseRank(7),
        IsFlushRank(6),
        IsStraightRank(5),
        IsThreeOfAKindRank(4),
        IsTwoPairRank(3),
        IsOnePairRank(2),
        IsHighCardRank(1);

    private final int value;

    private CardRank(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
