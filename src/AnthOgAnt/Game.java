package AnthOgAnt;

public class Game {
    private Player player1;
    private Player player2;
    private Dice dice;

    public Game(Player player1, Player player2, Dice dice1) {
        this.player1 = player1;
        this.player2 = player2;
        this.dice = dice1;
    }

    public void StartGame() {
        while ((player1.getScore() < 40) && (player2.getScore() < 40)) {
            playerTurn(player1);
            playerTurn(player2);
            System.out.println(player1.getName() + " score : " + player1.getScore());
            System.out.println(player2.getName() + " score :" + player2.getScore());
        }
        if (player1.getScore() > player2.getScore()){
            System.out.println(player1.getName() + " wins with " + player1.getScore() + " points.");
        }
        else {
            System.out.println(player2.getName() + " wins with " + player2.getScore() + " points.");
        }
    }

    private void playerTurn(Player player) {
        int value1;
        int value2;
        value1 = dice.roll();
        value2 = dice.roll();
        player.setScore(player.getScore() + value1);
        System.out.println(player.getName() + " slår med første terning = " + value1);
        player.setScore(player.getScore() + value2);
        System.out.println(player.getName() + " slår med anden terning = " + value2);
        if (value1 == 1 && value2 == 1) {
            player.setScore(0);
            System.out.println("Ærgerligt, score nulstillet.");
        } else if (value1 == value2) {
            value1 = dice.roll();
            value2 = dice.roll();
            player.setScore(player.getScore() + value1 + value2);
            System.out.println("Ekstra slag gav " + value1 +" og " + value2);
            System.out.println(player.getName() + " har nu " + player.getScore() + " point.");
        }
    }

}
