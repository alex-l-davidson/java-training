package classes;

public class Car {

    private String color;
    private String reg;
    private String model;
    private String make;
    private double miles;
    private Position position = new Position(0,0);

    // Constructor - this is required to allow objects to be instantiated
    public Car(String color, String reg, String model, String make,
               double miles) {
        this.color = color;
        this.reg = reg;
        this.model = model;
        this.make = make;
        this.miles = miles;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", reg='" + reg + '\'' +
                ", model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", miles=" + miles +
                ", position=" + position.toString() +
                '}';
    }

    //Getters
    public String getColor(){
        return color;
    }
    public String getReg(){
        return reg;
    }
    public String getModel(){
        return model;
    }
    public String getMake(){
        return make;
    }
    public double getMiles() {
        return miles;
    }

    public Position getPosition() {
        return position;
    }

    // Setters
    public void setColor(String color){
        this.color = color;
    }
    public void setReg(String reg){
        this.reg = reg;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setMake(String make){
        this.make = make;
    }
    public void setPosition(Position position) {
        this.position = position;
    }
//    May Not want to be able to overwrite
//    public void setMiles(int miles) {
//        this.miles = miles;
//    }
    // increaseMiles function (called by driveCar function in Driver class)
    public double increaseMiles(double newMiles) {
        this.miles = this.miles + newMiles;
        return this.miles;
    }

    //this isn't working as I want, because I want to add the coordinates to the previous
    public void moveCar(double x, double y) {
        position.setX(position.getX()+x);
        position.setY(position.getY()+y);
    }



}
