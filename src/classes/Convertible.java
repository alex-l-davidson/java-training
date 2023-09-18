package classes;

public class Convertible extends Car {
    private boolean roofDown = false;
    public Convertible(String color, String reg, String model,
                       String make, double miles){
        super(color, reg, model, make, miles);

    }

    @Override
    public String toString() {
        return "Convertible{" +
                "roofDown=" + roofDown +
                '}';
    }

    public boolean isRoofDown() {
        return roofDown;
    }

    public boolean changeRoofPosition() {
        roofDown = !roofDown;
        return roofDown;
    }

}
