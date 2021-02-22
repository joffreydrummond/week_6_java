package War;

public class Player {
    //list of Card
    private String hand;
    private int score;
    private String name;

    public Player(String name, String hand, int score){
        this.name = name;
        this.hand = hand;
        this.score = score;
    }

    public String describePlayer() {
        return "Player Name: " + name + "\nCurrent Hand: " + hand + "\nCurrent Score: " + score;
    }


    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
