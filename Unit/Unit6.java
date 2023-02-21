import java.util.Scanner;

public class Unit6 {
    public static void main(String[] args){
//        Fraction fList[] = new Fraction[5];
//        int intList[] = {1,2,3,4,5,6};
//        fList[0] = new Fraction(1,5);
//        fList[1] = new Fraction(1,5);
//        System.out.println(fList[0] + " " + fList[1]);
//        System.out.println(intList[0] + " " + intList[1]);
        int list[] = {2,4,6,8,10};
        doubleIt(list);
        int list1[] = makeArray();
        read(list1);
    }
    public static void doubleIt(int[] lis){
        for(int i=0;i<lis.length;i++){
            lis[i] *=2;
            System.out.print(lis[i] + " ");
        }
        System.out.println();
    }
    public static void read(int[] a){
        for(int i = 0; i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static int[] makeArray(){
        Scanner key = new Scanner(System.in);
        int num;
        System.out.print("how many numbers do you have to enter: ");
        num = key.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < num; i++){
            System.out.println("Enter #" + (i + 1));
            arr[i] = key.nextInt();
        }
        return arr;
    }
}
