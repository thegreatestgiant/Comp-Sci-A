public class Fraction {
//    Declare data attributes
private int num, denum;
private static int numFracs = 0;

//    Contructors

    public Fraction(){
        num = 0;
        denum = 1;
        numFracs ++;
    }

    public Fraction(int n, int d){
        num = n;
        denum = d;
        numFracs++;
    }

    public Fraction(int n){
        this (n,1);
    }

//    Accessor Methods
    public int getNum(){
        return num;
    }

    public int getDenum() {
        return denum;
    }

    public void getBoth(){
        System.out.println(num + "/" + denum);
    }

    public static int getNumOFrac(){
        return numFracs;
    }

    public String toString(){
        return num + "/" + denum;
    }

//    Mutator Methods
    public void setNum(int n){
        num = n;
    }

    public void setDenum(int d){
        denum = d;
    }

    public void setBoth(int n, int d){
        num = n;
        denum = d;
    }

    private int gcf(int n1, int n2){
        int gcf = Math.min(n1,n2);
        while (gcf % num != 0 && gcf % denum != 0) {
            gcf--;
        }
        return gcf;
    }

    public void reduce(){
        int gcf = gcf(num,denum);
        num /= gcf;
        denum /= gcf;
    }

    public boolean equal(Fraction other) {
        return this.num == other.num && this.denum == other.denum;
    }

}
