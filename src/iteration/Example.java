package iteration;

public class Example {
    public static void main(String[] args) {
        // for loop
        for (int i = 0; i < 10; i ++) {
            System.out.println(i);
        }
        // while loop
        int sandwiches = 0;
        boolean notEnoughSandwiches = true;
        while ( notEnoughSandwiches ) {
            System.out.println("add another sandwich");
            sandwiches++;

            if (sandwiches > 12) {
                notEnoughSandwiches = false;
            }
        }
        System.out.println("now there are too many sandwiches");

        // do-while loop
        int cupsOfTea = 2;
        boolean notEnoughCupsOfTea = false;

        do {//this block is always run regardless of the while condition
            System.out.println("get another cuppa");
            cupsOfTea++;
            if (cupsOfTea >= 2) {
                notEnoughCupsOfTea = false;
            }
        } while (notEnoughCupsOfTea);
        System.out.println(cupsOfTea);

        // transfer and control statements
        for (int i = 0; i < 10; i ++) {
            if (i == 2) {
                continue;//this ends the current iteration but continues the loop
            }
            if (i == 7) {
                break;//this ends the loop entirely
            }
            System.out.println(i);
        }
    }
}
