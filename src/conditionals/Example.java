package conditionals;

public class Example {
    public static void main(String[] args) {

        boolean isLightOn = true;

        if (isLightOn) {//equivalent to isLightOn == true
            System.out.println("I can see");
        } else {
            System.out.println("It's dark!");
        }

        // VARS
        Integer number = 10;

        // Is equal to
        if (number == 8) {
            System.out.println("number is 8");
        } else {
            System.out.println("number is 8");
        }
        // Is NOT equal to
        if (number != 10) {
            System.out.println("number is not 10");
        } else {
            System.out.println("number is 10");
        }
        // less than
        if (number < 20) {
            System.out.println("number is smaller than 20");
        }
        // greater than
        if (number > 3) {
            System.out.println("number is greater than 3");
        }
        // less than or equal to
        if (number <= 12) {
            System.out.println("number is less than or equal to 12");
        }
        // greater than or equal to
        if (number >= 9) {
            System.out.println("number is greater than or equal to 9");
        }
        // AND
        if (number > 3 && number < 11) {
            System.out.println("number between 3 and 11");
        }
        // OR
        if (number == 1 || number == 10) {
            System.out.println("number is either 1 or 10");
        }
        // Type
        // note can only do this with classes, not primitives, therefore changed int to Integer to allow this to work
        if (number instanceof Integer ) {
            System.out.println("number is an integer");
        }

        // IF / ELSE IF / ELSE
        if (number == 1) {
            System.out.println("we are number 1");
        } else if (number == 4) {
            System.out.println("four ain't bad");
        } else if (number == 10) {
            System.out.println("the number is 10");
        } else {
            System.out.println("here we are");
        }

        // SWITCH CASE
        // alternative to giant if/else if/else trees
        int day;
        day = 1;
        switch(day) {
            case 1:
                System.out.println("Monday");
                break; //need a break so it doesn't go through all of them
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default://a fallback, so the code doesn't break
                System.out.println("Not a valid day.");
                break;
        }
    }
}
