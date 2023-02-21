public class Pet{
    private String name;
    private int age;
    private boolean isSold;
    public Pet(String n, int a, boolean iS){
        name = n;
        age = a;
        isSold = iS;
    }

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
}