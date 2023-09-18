package classes;

public class Driver {
    private Car car;

    // could have an empty constructor here if the driver doesn't necessarily
    // need a car
    public Driver (Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }
    public void setCar(Car car){
        this.car = car;
    }

    public void driveCar(double miles, double x, double y){
        car.increaseMiles(miles);
        car.moveCar(x, y);
        if (this.car.getClass() == Convertible.class) {
            ((Convertible) this.car).changeRoofPosition();
        } else if(this.car.getClass() == Supercar.class) {
            ((Supercar) this.car).changeSportMode();
        }
    }
}