package War;

import java.util.ArrayList;
import java.util.List;

public class Deck extends Card {
    //List of cards
//   private String cards;
    //maybe?
    protected List<String> cards;


    public Deck(String name, int value) {
        super(name, value);
        cards = new ArrayList<>(52);

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
