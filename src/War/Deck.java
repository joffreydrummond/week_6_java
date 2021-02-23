package War;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Deck {

    protected List<Card> cards;

    int index = 0;

    public Deck() {
        String[] suits = {"♦", "♣", "♥", "♠"};
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ,11, 12, 13};
        cards = new ArrayList<>(52);

        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (int i = 0; i < numbers.length; i++){
            for (String suit : suits){
                cards.add(new Card());
                index++;
            }
        }
        System.out.println(cards);

    }






//   public Deck(String cards){
//       this.cards = cards;
//   }
//
//    public String getCards() {
//        return cards;
//    }
//
//    public void setCards(String cards) {
//        this.cards = cards;
//    }
}
