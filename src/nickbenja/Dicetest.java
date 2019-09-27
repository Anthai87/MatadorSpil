package nickbenja;

public class Dicetest {


    public static void main(String[] args) {

        int count = 1;
        while (count <= 1000) {
            int diceX=(int)(Math.random()*6+1); int diceY=(int)(Math.random()*6+1); int sum1=diceX+diceY;
            System.out.println("you rolled " + diceX + " + " + diceY +  " = " + sum1 + " amout of rolls " + count);
            count++;
        }

    }
}
