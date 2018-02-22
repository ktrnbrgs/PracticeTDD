package main.java.poker

interface Card {
    CardFace face { get; }
    CardNum num { get; }
    string ToString();
}