import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;
    private Dice dice;
    int value1;
    int value2;
    boolean vind = false;

    public Game(Player player1, Player player2, Dice dice1) {
        this.player1 = player1;
        this.player2 = player2;
        this.dice = dice1;
    }

    public void StartGame() {
        while (vind == false) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Tryk enter for at slå for Player1");
            scanner.nextLine();
            playerTurn(player1);
            System.out.println("Tryk enter for at slå for Player2");
            scanner.nextLine();
            playerTurn(player2);
            System.out.println(player1.getName() + " score: " + player1.getScore());
            System.out.println(player2.getName() + " score: " + player2.getScore());
        }
        if (player1.isWinner() ) {
            System.out.println(player1.getName() + " vinder med " + player1.getScore() + " point.");
        }
        else if (player2.isWinner()){
            System.out.println(player2.getName() + " vinder med " + player2.getScore() + " point.");
        }
        }


    private void playerTurn(Player player) {

        value1 = dice.roll();
        value2 = dice.roll();
        player.setScore(player.getScore() + value1);
        System.out.println(player.getName() + " slår med første terning = " + value1);
        player.setScore(player.getScore() + value2);
        System.out.println(player.getName() + " slår med anden terning = " + value2);
        if (value1 == 1 && value2 == 1) {
            player.setScore(0);
            System.out.println("Ærgerligt, score nulstillet.");
        } else if (value1 == value2 && player.getScore() < 40) {
            value1 = dice.roll();
            value2 = dice.roll();
            player.setScore(player.getScore() + value1 + value2);
            System.out.println("Ekstra slag gav " + value1 +" og " + value2);
        }
        if (player.getScore() >= 40 && value1 == value2){
            vind = true;
            player.setWinner(true);
        }
    }

}
