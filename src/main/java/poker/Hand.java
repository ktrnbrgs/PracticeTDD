package main.java.poker;

import java.lang.*;

interface Hand {
    IList<Card> Cards { get; }
    string ToString();
}
