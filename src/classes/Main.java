package classes;

public class Main {

    public static void main(String[] args) {
        Car c1 = new Car("red", "MD15 FFS",
                "Ford", "Fiesta", 10000);
        Driver alex = new Driver(c1);

        alex.driveCar(1000, 900, 100);
//        System.out.println(c1.getMiles());
//        System.out.println(c1.getPosition().getX());
//        System.out.println(c1.getPosition().getY());
//
//        alex.driveCar(135067, 67, 135000);
//
//        System.out.println(c1.getMiles());
//        System.out.println(c1.getPosition().getX());
//        System.out.println(c1.getPosition().getY());
//        System.out.println(c1);

        Convertible elise = new Convertible("yellow", "HS20 HJK",
                "Elise", "Lotus", 0);
        Supercar charger = new Supercar("black", "EO34 DER",
                "F1","Ferrari",0);
//        System.out.println(elise);
//        alex.setCar(c1);
//        alex.driveCar(20,5,15);
//        System.out.println(elise);
//        System.out.println(elise.isRoofDown());
//        elise.changeRoofPosition();
//        System.out.println(elise.isRoofDown());
//        elise.changeRoofPosition();
//        System.out.println(elise.isRoofDown());
//        System.out.println(alex.driveCar(10,10,10));
//        System.out.println(elise.isRoofDown());
//        alex.setCar(charger);
//        System.out.println(alex.driveCar(20,6,7));
//        System.out.println(charger.isSportMode());
//        System.out.println(alex.driveCar(20,6,7));
//        System.out.println(charger.isSportMode());
//        System.out.println(elise);
//        System.out.println(Car.class.getSuperclass());

        IDrivable d1 = new Convertible("red", "ABD", "Cooper", "Mini", 0);
        Driver jake = new Driver(d1);
        System.out.println(jake.driveCar(10,7,3));

        IDrivable lawnmow1 = new Lawnmower("push", 0);
        System.out.println(lawnmow1);

        jake.setCar(lawnmow1);
        System.out.println(lawnmow1.drive(10));


    }

    // 1 // Car Class
    // - color
    // - reg
    // - model
    // - make
    // - miles
    // + increaseMiles
    // + other Getters and Setters

    // 2 // Driver Class
    // - Car
    // + Drive(miles)
    // + Car Setter and Getter

    // 3 // Instantiate the Car and Drive, test the methods.

    // Extension
    // 4 // position class (double x, double y)
    // 5 //Give Car a position which is edited by drive
    // 6 // ToString, Equals, HashCode
}
