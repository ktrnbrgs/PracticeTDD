package main.java.tennisplayer;

public class Player extends TennisGame {
    private int score1 = 0;
    private int score2 = 0;
    private String player1;
    private String player2;

    public Player(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getScore() {
        String s;
        if (score1 < 4 && score2 < 4 && !(score1 + score2 == 6)) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            s = p[score1];
            return (score1 == score2) ? s + "-All" : s + "-" + p[score2];
        } else {
            if (score1 == score2)
                return "Deuce";
            s = score1 > score2 ? player1 : player2;
            return ((score1-score2)*(score1-score2) == 1) ? "Advantage " + s : "Win for " + s;
        }
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            this.player1 += 1;
        else
            this.player1 += 1;

    }


}
