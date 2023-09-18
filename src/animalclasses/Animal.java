package animalclasses;

public class Animal {
    private String name;
    private int age;
    private boolean isHungry = false;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "This animal's " +
                "name is " + name +
                ", and their age is " + age +
                '.';
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHungry() {
        return isHungry;
    }
    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }
}
