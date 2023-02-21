public class Unit5 {
    public static void main(String[] args){
        Fraction frac1 = new Fraction();

        Fraction frac2 = new Fraction(99,18);
        frac2.reduce();
        frac2.getBoth();
        System.out.println("Number of fractions: " + frac1.getNumOFrac());

        frac1.setBoth(5,1);
        frac2.setBoth(5,1);
        System.out.println(frac1.equal(frac2));
        System.out.println(frac1);
        frac1.getBoth();
    }

}
