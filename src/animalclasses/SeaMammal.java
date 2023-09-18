package animalclasses;

public class SeaMammal extends Mammal {

    private String breath;

    public SeaMammal (String name, int age, int gestPeriod, String breath) {
        super(name, age, gestPeriod);
        this.breath = breath;
    }

    @Override
    public String toString() {
        return "This animal is a sea mammal. Their name is " +
                getName() + ", age is " + getAge() + ", gestation period is " +
                getGestPeriod() + " months" + ", and they breathe via " + breath + ".";
    }

    public String getBreath() {
        return breath;
    }
    public void setBreath(String breath) {
        this.breath = breath;
    }
}
