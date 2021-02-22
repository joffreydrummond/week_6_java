package War;

public abstract class Card {

    private int value;
    private String name;

    public Card(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String describeCard() {
        return "Name of card: " + name + "\nCard Value: " + value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value >= 2 && value <= 14) {
            this.value = value;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
