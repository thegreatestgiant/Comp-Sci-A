import java.util.Scanner;

class Quiz {
  public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    // 1
    System.out.println("Welcome to Java \nWelcome to Computer Science \nProgramming is fun\n");
    // 2
    System.out.println("\n   xxxxx\n  x     x\n({  o o  })\n  |  v  |\n  | === |\n   -----\n");
    // 3
    System.out.print("What is your favorite movie: ");
    String movie = key.nextLine();
    System.out.println("Your favorite movie is: " + movie + "\n");
    // 4
    System.out.print("Enter an Integer: ");
    int integer = key.nextInt();
    System.out.println(2 * integer);
    // 5
    System.out.print("Please enter the radius of a circle: ");
    int rad = key.nextInt();
    final double pi = 3.14;
    System.out.println("The perimeter of the circle is: " + (2 * rad * pi));
    System.out.println("\nThe area of the circle is: " + (rad * rad * pi) + "\n");
    // 6
    double sharesP = 21.77;
    double sharesA = 600;
    double cost = sharesP * sharesA;
    double comm = cost * .02;
    System.out.println("Amount paid for stock: " + cost);
    System.out.println("Amount paid for commision: " + comm);
    System.out.println("Total amount paid: " + (cost + comm));
  }
}
