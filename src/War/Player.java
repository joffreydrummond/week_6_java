package War;

import java.util.ArrayList;
import java.util.List;

public class Player {
    //list of Card
    private List<Card> hand;
    private int score;
    private String name;

    public Player(String name, List<Card> hand) {
        this.name = name;
        this.hand = new ArrayList<>(hand);
        this.score = 0;
    }

    public String describePlayer() {
        score = 0;
        return "Player Name: " + name + "\nCurrent Hand: " + hand + "\nCurrent Score: " + score;
    }

    public boolean handIsEmpty(){
        return hand.size() == 0;
    }

    public Card playCard(){
        return this.hand.remove(0);
    }
    public void addScore() {
        this.score = score+1;
    }

//    public void draw(){
//        System.out.println("IT IS A DRAW. No points scored.");
//    }

    public String getName() {
        return name;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }


    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

}
