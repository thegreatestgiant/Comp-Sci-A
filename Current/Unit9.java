class main {
    public static void main(String[] args){
        Dog dog1 = new Dog("Lassie", 5, false, "Collie");
        Dog dog2 = new Dog("Snoopy", 3, false, "Beagle");

        System.out.println(dog1.getAge());
        System.out.println(dog1.getName());
        System.out.println(dog2.getAge());
        System.out.println(dog2.getName());
        
        Pet pet1 = new Pet("", 0, false);
        System.out.println(pet1.getAge());
        System.out.println(pet1.getName());
    }
}