package classes;

public class Lawnmower implements IDrivable {
    private String power;
    private double miles;
    public Lawnmower(String power, double miles) {
        this.power = power;
        this.miles = miles;
    }
    @Override
    public String toString() {
        return "Lawnmower{" +
                "power='" + power + '\'' +
                ", miles=" + miles +
                '}';
    }
    public String getPower() {
        return power;
    }
    public double getMiles() {
        return miles;
    }
    @Override
    public double drive(double miles) {
        this.miles = this.miles + miles;
        return this.miles;
    }
}
