package War;

public class Card {

    private String suit;
    private int value;
    private String face;

    public Card(String suit, int value, String face) {
        this.suit = suit;
        this.value = value;
        this.face = face;
    }

    public String describeCard() {
        return "Suit: " + suit + "\nValue: " + value + "\nFace: " + face;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;

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
