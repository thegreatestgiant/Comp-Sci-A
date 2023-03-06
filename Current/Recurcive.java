public class Recurcive {
    public static void main(String[] args) {
        System.out.println("Factoral of 3  " + Factoral(3));
        System.out.println("Power of 2 to the 3" + Power(2, 3));
    }

    public static int Factoral(int n) {
        int t = 1;
        if (n == 1)
            return 1;
        else
            return n * Factoral(n - 1);
    }

    public static int Power(int n, int e) {
        if (e == 0) {
            return e;
        } else if (e == 1)
            return n;
        else
            return n * Power(n, e - 1);
    }

}