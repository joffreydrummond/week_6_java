package War;

import java.util.Collections;

public class App {

    public static void main(String[] args) {
        Deck deck = new Deck();
     ;
        Player player1 = new Player("Fred", deck.cards.subList(0, 26));
        Player player2 = new Player("Frank", deck.cards.subList(26, 52) );


    }
}
