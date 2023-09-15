package flowofcontrol;

import java.util.Random;
public class Dice {

    public static void main(String[] args) {
        System.out.println( rollTwoDice() );
    }

    public static int rollDice() {
        return new Random().nextInt(7);
    }

    public static int rollTwoDice() {
        int total = 0;
        total += rollDice();
        total += rollDice();
        return total;
    }
}
