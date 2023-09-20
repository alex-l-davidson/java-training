package passby;

public class Car {

    static int counter = 0;

    private int vim;

    public Car(){
        this.vim = Car.counter;
        Car.counter += 7;
    }

    public int getVim() {
        return this.vim;
    }
}
