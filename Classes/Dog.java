public class Dog extends Pet{
    private String breed;
    
    public Dog(String n, int a, boolean iS, String b){
        super(n, a, iS);
        breed = b;
    }

    public int getAge() {
        return super.getAge() * 7;
    }

    public String getBreed(){
        return breed;
    }
}