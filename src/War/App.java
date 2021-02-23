package War;

import java.util.Collections;

public class App {

    public static void main(String[] args) {
        Player player = new Player("Fred", "great", 5);
//        Deck deck = new Deck("Free", "Big Bank", );


        Card card = new Card("Ace of Clubs", 2,"heart" );
        System.out.println(card.describeCard());
        System.out.println(player.describePlayer());





    }
}
