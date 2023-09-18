package animalclasses;

public class Main {
    public static void main(String[] args) {

        Animal a1 = new Animal("Zoe", 2);
//        System.out.println(a1);

        Mammal m1 = new Mammal("Bentley", 5, 3);
//        System.out.println(m1);

        SeaMammal s1 = new SeaMammal("Dolly", 7, 10, "blow hole");

        Animal[] myAnimals = new Animal[3];
        myAnimals[0] = a1;
        myAnimals[1] = m1;
        myAnimals[2] = s1;
        for (int i = 0; i < myAnimals.length; i++) {
            System.out.println(myAnimals[i]);
        }

        Keeper k1 = new Keeper("Alex", a1);
        Keeper k2 = new Keeper("Kieran", m1);
        Keeper k3 = new Keeper("Helen", s1);

        System.out.println(a1.isHungry());
        System.out.println(m1.isHungry());
        System.out.println(s1.isHungry());

        System.out.println(k1.feedAnimal());
        System.out.println(k2.feedAnimal());
        System.out.println(k3.feedAnimal());

        a1.setHungry(true);
        m1.setHungry(true);
        s1.setHungry(true);

        System.out.println(a1.isHungry());
        System.out.println(m1.isHungry());
        System.out.println(s1.isHungry());

        System.out.println(k1.feedAnimal());
        System.out.println(k2.feedAnimal());
        System.out.println(k3.feedAnimal());

        System.out.println(a1.isHungry());
        System.out.println(m1.isHungry());
        System.out.println(s1.isHungry());




    }
}
