import java.util.Scanner;
class Unit1 {
    public static void main(String[] args) {
        // int num1 = 20;
        // int num2 = 30;
        String name = "Hello ";
        // System.out.print("Hello " + name + "\nGoodbye " + name + "\n");2
        // System.out.println(num1 + num2);
        Scanner keyb=new Scanner(System.in);
        // System.out.print("Enter 2 numbers: ");
        // num1=keyb.nextInt();
        // num2=keyb.nextInt();
        // System.out.println("The sum is: "+(num1+num2));
        // double hi=10.5;
        // double num3 = num2;
        // System.out.println("The sume is "+num1+" "+num2+" "+hi+" "+num3);
        System.out.println("What's your name? "+keyb.nextLine());
        System.out.println(name /*+ help*/);
    }
}
