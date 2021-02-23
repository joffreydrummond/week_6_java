package War;

public class Card {

    private int value;
    private String face;
    private String suit;

    public Card(String suit, int value, String face) {
        this.suit = suit;
        this.value = value;
        this.face = face;
    }

    public String describeCard() {
        return "Name of card: " + suit + "\nCard Value: " + value + "\nFace: " + face;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value >= 2 && value <= 14) {
            this.value = value;
        }
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }


    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }
}
