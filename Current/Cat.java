public class Cat extends Pet{
    private String breed;
    
    public Cat(String n, int a, boolean iS, String b){
        super(n, a, iS);
        breed = b;
    }

    public int getAge() {
        return super.getAge() * 5;
    }

    public String getBreed(){
        return breed;
    }
}