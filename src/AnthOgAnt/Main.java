package AnthOgAnt;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("Anton", 0, false);
        Player player2 = new Player("Anthony", 0, false);
        Dice dice = new Dice(0);
        Game game = new Game(player1,player2,dice);
        game.StartGame();
    }
}
