public class Dog extends Pet{
    private String breed;
    
    public Dog(String n, int a, boolean iS, String b){
        super(n, a, iS);
        breed = b;
    }

    @Overide
    public int getAge() {
        return super.getAge() * 7;
    }
}