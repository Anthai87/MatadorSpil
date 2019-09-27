package AnthOgAnt;

public class Game {
    private Player player1;
    private Player player2;
    private Dice dice1;

    public Game(Player player1, Player player2, Dice dice1) {
        this.player1 = player1;
        this.player2 = player2;
        this.dice1 = dice1;
    }

    public void StartGame() {
        //player1.setPlayerturn(true);
        int value1;
        int value2;
        while ((player1.getScore() < 40) && (player2.getScore() < 40)) {
            value1 = dice1.roll();
            value2 = dice1.roll();
            player1.setScore(player1.getScore() + value1);
            System.out.println("Dice 1 = " + value1);
            player1.setScore(player1.getScore() + value2);
            System.out.println("Dice 1 = " + value2);
            if (value1 == value2) {
                player1.setScore(0);
                System.out.println("Too bad, score reset");
            }

            player2.setScore(player2.getScore() + dice1.roll());
            System.out.println("Player 1 score :" + player1.getScore());
            System.out.println("Player 2 score :" + player2.getScore());
        }
        if (player1.getScore() > player2.getScore()){
            System.out.println("Player 1 wins with " + player1.getScore() + " points.");
        }
        else {
            System.out.println("Player 2 wins with " + player2.getScore() + " points.");
        }
    }

}
