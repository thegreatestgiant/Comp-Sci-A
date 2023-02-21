package PACKAGE_NAME;
import java.util.*;
class Unit4 {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        int num = 0;
        int total = 0;
//        while (num <= 10){
//            total += num;
//            System.out.println("The number is " + num);
//            num++;
//        }
//        System.out.println("the total is " + total);
//        System.out.println("Please enter a number between 10 and 50");
//        num = key.nextInt();
//        while (num <10 || num >50){
//            System.out.println("Please enter a number between 10 and 50");
//            num = key.nextInt();
//        }
//        System.out.println("Thank You");

        int avg = 0;
        int numOT = 0;
//        while(num != -99){
//            System.out.println("Enter a number to average (-99 to end):");
//            num = key.nextInt();
//            if(num == -99)
//                break;
//            avg += num;
//            numOT ++;
//        }
//        System.out.println("the average is " + (avg/numOT));

        for (int i=0;i<=10;i++){
            for (int j=11-i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
//            System.out.println("The number is " + i);
//            total += i;
//            if(i==10)
//                System.out.println("The total is " + total);
        }
    }
}
