package nickbenja;

public class Game {
    public static void main(String[] args) {

        int diceX1=(int)(Math.random()*6+1); int diceY1=(int)(Math.random()*6+1); int sum1=diceX1+diceY1;
        int diceX2=(int)(Math.random()*6+1); int diceY2=(int)(Math.random()*6+1); int sum2=diceX2+diceY2;
        System.out.println("Player 1 rolled " + diceX1 + " + " + diceY1 +  " = " + sum1);
        System.out.println("Player 2 rolled " + diceX2 + " + " + diceY2 +  " = " + sum2);
        if sum1=sum2 // print ingen vinder
        if sum1<sum2 // player 1 wins
        if sum1>sum2 // player 2 wins
    }
}
