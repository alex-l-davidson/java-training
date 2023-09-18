package animalclasses;

public class Keeper {
    private String name;
    //the keeper cares for an animal
    private Animal animal;

    public Keeper(String name, Animal animal) {
        this.name = name;
        this.animal = animal;
    }

    public String feedAnimal() {
        if(animal.isHungry()) {
            animal.setHungry(false);
            return animal.getName() + " has been fed and is no longer hungry!";
        } else {
            return animal.getName() + " was not hungry.";
        }

    }
}
