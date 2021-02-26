package War;

public class App {
//    public static void draw() {
//        System.out.println("IT IS A DRAW. No points scored.");
//    }

    public static void main(String[] args) {
        Deck deck = new Deck();
//
        Player player1 = new Player("Fred", deck.cards.subList(0, 26));
        Player player2 = new Player("Frank", deck.cards.subList(26, 52));

        int round = 1;
        while (round <= 26) {
//    //get a card from each player
            int player1Value = player1.playCard().getValue();
            int player2Value = player2.playCard().getValue();
            //determine who won hand
            if (player1Value > player2Value) {
                player1.addScore();
                round++;

            } else if (player1Value < player2Value) {
                player2.addScore();
                round++;
            } else {
//                draw();
                round++;
            }
        }
        int player1Score = player1.getScore();
        int player2Score = player2.getScore();
        //print info/score and winner
        //determine winner and current score show and show the current round
        //after rounds are complete determine winner and display
//
        if (player1.handIsEmpty() && player2.handIsEmpty()) {
            if (player1Score > player2Score) {
                System.out.println(player1.describePlayer());
            } else if (player1Score < player2Score) {
                System.out.println(player2.describePlayer());
            } else {
                System.out.println("Draw? Randomly getting cards and it's a draw? You both suck.");
            }
        }
    }
}
