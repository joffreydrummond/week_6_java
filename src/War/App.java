package War;

public class App {
    public static void draw() {
        System.out.println("IT IS A DRAW. No points scored.");
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
//
        Player player1 = new Player("Fred", deck.cards.subList(0, 26));
        Player player2 = new Player("Frank", deck.cards.subList(26, 52));


        int round = 1;
//        System.out.println("This is the value" + player2.playCard().getValue());
//
//        while (!player1.handIsEmpty() && !player2.handIsEmpty()) {
        while (round <= 26) {
//    //get a card from each player
            int player1Value = player1.playCard().getValue();
            int player2Value = player2.playCard().getValue();

//            //determine who won hand
            if (player1Value > player2Value) {
                player1.addScore();
                round++;

            } else if (player1Value < player2Value) {
                player2.addScore();
                round++;
            } else {
                draw();
                round++;
            }
//
            int player1Score = player1.getScore();
            int player2Score = player2.getScore();

            if (player1Score > player2Score){
                System.out.println("Player 1 is the champion!!!");
            } else if(player1Score < player2Score){
                System.out.println("Player 2 is the champion!!!");
            } else {
                System.out.println("You both suck.");
            }

//
//            //print info/score and winner
//
//            //determine winner and current score show and show the current round
//
        }

        //after rounds are complete determine winner and display
        //end of game

    }
}
