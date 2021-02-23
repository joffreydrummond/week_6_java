package War;

import java.util.List;

public class Player {
    //list of Card
    private List<Card> hand;
    private int score;
    private String name;

    public Player(String name, List<Card> hand) {
        this.name = name;
        this.hand = hand;
        this.score = 0;
    }

    public String describePlayer() {
        score = 0;
        return "Player Name: " + name + "\nCurrent Hand: " + hand + "\nCurrent Score: " + score;
    }

    public Card playCard(){
        return this.hand.remove(0);
    }

    public int getScore() {
        return score;
    }

    public void addScore(int score) {
        this.score += score;
    }

    public String getName() {
        return name;
    }

}
