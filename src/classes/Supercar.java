package classes;

public class Supercar extends Car{
    private boolean sportMode = false;
    public Supercar(String color, String reg, String model,
                    String make, double miles) {
        super(color, reg, model, make, miles);
    }

    public boolean isSportMode() {
        return sportMode;
    }

    public boolean changeSportMode() {
        sportMode = !sportMode;
        return sportMode;
    }
}
