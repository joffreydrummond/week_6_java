package War;

public class App {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Card card = new Card("♦", 12, "3");

        System.out.println(card.describeCard());
        System.out.println(card.getValue());

//        Card card = new Card();

        Player player1 = new Player("Fred", deck.cards.subList(0, 26));
        Player player2 = new Player("Frank", deck.cards.subList(26, 52));

        System.out.println(player1.describePlayer());
        System.out.println(player1.getHand());
        int round = 1;

//        player1.playCard();
//        player2.playCard();
        while (player1.handIsEmpty() && player2.handIsEmpty()) {
//    //get a card from each player
//
//            player1.playCard();
//            player2.playCard();




//
//            //determine who won hand
//
//            //update score and
//            //print info/score and winner
//
//            //determine winner and current score show and show the current round
//
        }

        //after rounds are complete determine winner and display
        //end of game

    }
}
