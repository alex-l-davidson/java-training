package animalclasses;

public class Mammal extends Animal{
    private int gestPeriod;

    public Mammal(String name, int age, int gestPeriod){
        super(name, age);
        this.gestPeriod = gestPeriod;
    }

    @Override
    public String toString() {
        return "This animal is a mammal. Their name is " +
                getName() + ", age is " + getAge() + ", and gestation period is " +
                gestPeriod + " months.";
    }

    public int getGestPeriod() {
        return gestPeriod;
    }
    public void setGestPeriod(int gestPeriod) {
        this.gestPeriod = gestPeriod;
    }
}
