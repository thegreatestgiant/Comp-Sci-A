import java.util.ArrayList;

class main {
    public static void main(String[] args){
        Dog dog1 = new Dog("Lassie", 5, false, "Collie");
        Dog dog2 = new Dog("Snoopy", 3, false, "Beagle");

        Cat cat1 = new Cat("Garfield", 5, false, "Tabby");
        Cat cat2 = new Cat("Morris", 3, false, "Siamese");

        System.out.println(dog1.getAge());
        System.out.println(dog1.getName());
        System.out.println(dog2.getAge());
        System.out.println(dog2.getName());

        System.out.println(cat1.getAge());
        System.out.println(cat1.getName());
        System.out.println(cat2.getAge());
        System.out.println(cat2.getName());

        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(dog1);
        pets.add(dog2);
        pets.add(cat1);
        pets.add(cat2);

        for (Pet p:pets){
            System.out.println(p.getName() + ": " + p.getAge());
            System.out.println(p.getBreed());
        }

    }
}