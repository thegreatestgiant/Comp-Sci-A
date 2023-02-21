import java.util.Scanner;

class Method {
  public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    System.out.println("Enter 3 integers");
    int n1 = key.nextInt();
    int n2 = key.nextInt();
    int n3 = key.nextInt();
    System.out.println("The sum is " + sumUp(n1, n2, n3));
  }

  public static int sumUp(int n1, int n2, int n3) {
    int sum = n1 + n2 + n3;
    return sum;
  }
}
