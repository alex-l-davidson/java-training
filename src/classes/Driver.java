package classes;

public class Driver {
    private IDrivable car;

    // could have an empty constructor here if the driver doesn't necessarily
    // need a car
    public Driver (IDrivable car) {
        this.car = car;
    }

    public IDrivable getCar() {
        return car;
    }
    public void setCar(IDrivable car){
        this.car = car;
    }

    public String driveCar(double miles, double x, double y){
//        car.increaseMiles(miles);
        car.drive(miles);
        Class sc = this.car.getClass();
        if (this.car.getClass() == Car.class || sc.getSuperclass() == Car.class) {
            ((Car) this.car).moveCar(x, y);
            if (this.car.getClass() == Convertible.class) {
                ((Convertible) this.car).changeRoofPosition();
            } else if(this.car.getClass() == Supercar.class) {
                ((Supercar) this.car).changeSportMode();
            }
            return "Total miles: " + ((Car) this.car).getMiles() + ", " +
                    "Current Position: (" + ((Car) this.car).getPosition().getX()
                    + ", " + ((Car) this.car).getPosition().getY() + ")";
        } else {
            return "You're not driving a car";
        }
    }
}