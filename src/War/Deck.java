package War;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    protected List<Card> cards;
    int index = 0;

    public Deck() {
        cards = new ArrayList<>(52);
        String[] suits = {"♦", "♣", "♥", "♠"};
        String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        for (int i = 0; i < faces.length; i++) {
            for (String suit : suits) {
                cards.add(new Card(suit, values[ i ], faces[ i ]));
                index++;
            }
        }
        Collections.shuffle(cards);
    }

}
