package PACKAGE_NAME;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner key = new Scanner(System.in);

    Unit3 unit3 = new Unit3();
    unit3.main(args);

    // Stringe s= new Stringe();
    //   s.main(args);

    // Quiz2 q2 = new Quiz2();
    // q2.main(args);
    
    // Tri t = new Tri(5,5,5);
    // System.out.println(t.getArea());   
    
    // Method n=new Method();
    // n.main(args);
    
    // Quiz quiz = new Quiz();
    // quiz.main(args);
    
    // Unit1 u1 = new Unit1();
    // u1.main(args);
    
    // // Unit #2
    // Circle circ1, circ2;
    // circ1 = new Circle();
    // circ2 = new Circle(5);
    // circ1.setRadius(10);
    // circ2.setRadius(20);
    // // System.out.println("Circle 1 has a radius of " + circ1.getRadius());
    // // System.out.println("Circle 2 has a radius of " + circ2.getRadius());
    // // System.out.println("Circle 1 has an area of " + circ1.getArea()); 
    // // System.out.println("Circle 2 has an area of " + circ2.getArea());
    // // System.out.print("Set the radius of Circle 1 to: ");
    // // int rad1 = key.nextInt();
    // // System.out.println("The new radius of Circle 1 is: " + rad1);
    
    // // addTen(2);
    // // addTitle("shlomo");
  }

  public static void addTen(int num){
    num += 10;
    System.out.println("The number is now " + num);
  }
  
  public static void addTitle(String name){
    name = "Mr. " + name;
    System.out.println("Hello " + name);
  }
}
