package passby;

public class Main {

    public static void main(String[] args) {
        // Pass-By-Value (primitive)
        int a = 1;      //Create a variable with value of 1
        int b = a;      //the VALUE 1 is cloned for b

        a++;            // add 1 to a = 1+1 = 2
                        // b and a are separate!
        b++;            // add 1 to b = 1+1 = 2

        System.out.println(a);      // 2
        System.out.println(b);      // 2

        // Pass-By-Reference (non-primitive data types)

        Number one = new Number();  // 0
        Number two = one;           // It doesn't create a new number
                                    // It is a reference to "one"
        one.AddToNumber(5);         // add 5 to "one" = 0+5=5
        two.AddToNumber(5);         // add 5 to "two", "two" is "one", so 5+5=10

        System.out.println(one.myNumber);   // 10
        System.out.println(two.myNumber);   // 10

        Car[] cars = {new Car(), new Car(), new Car()};     // static counter increases by 7 with each new car

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getVim());
        }

        System.out.println(Car.counter);



    }

}
