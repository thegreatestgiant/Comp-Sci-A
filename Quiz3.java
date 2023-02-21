import java.util.*;
class Quiz3 {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        name();
        magic();
        System.out.println("How many checks were written this month?");
        int service = key.nextInt();
        System.out.println("Your fees for this month was $" + check(service));
    }
    public static void magic(){
        Scanner key = new Scanner(System.in);
        System.out.println("What is the month?");
        int month = key.nextInt();
        System.out.println("What is the day?");
        int day = key.nextInt();
        System.out.println("What is the last two digits of the year?");
        int year = key.nextInt();
        if (month * day == year)
            System.out.println("Date is Magic");
        else System.out.println("Date is not Magic");
    }
    public static void name(){
        Scanner key = new Scanner(System.in);
        String t1 = "";
        String t2 ="";
        String t3 ="";
        System.out.println("Enter 3 names each on a new line");
        String n1 = key.nextLine();
        String n2 = key.nextLine();
        String n3 = key.nextLine();
        if (n1.compareTo(n2)<0 && n1.compareTo(n3)<0 && n2.compareTo(n3)<0) {
            t1 = n1;
            t2 = n2;
            t3 = n3;
        }
        else if(n1.compareTo(n2)<0 && n1.compareTo(n3)<0 && n2.compareTo(n3)>0){
            t1 = n1;
            t2 = n3;
            t3 = n2;
        }
        else if (n1.compareTo(n2)>0 && n1.compareTo(n3)<0 && n2.compareTo(n3)<0){
            t1 = n2;
            t2 = n1;
            t3 = n3;
        }
        else if(n1.compareTo(n2)>0 && n1.compareTo(n3)>0 && n2.compareTo(n3)<0){
            t1 = n2;
            t2 = n3;
            t3 = n1;
        } else if (n1.compareTo(n2)<0 && n1.compareTo(n3)>0 && n2.compareTo(n3)>0) {
            t1 = n3;
            t2 = n1;
            t3 = n2;
        }
        else if (n1.compareTo(n2)>0 && n1.compareTo(n3)>0 && n2.compareTo(n3)>0){
            t1=n3;
            t2=n2;
            t3=n1;
        }
        System.out.println(t1+"\n"+t2+"\n"+t3);
    }
    public static double check(int check){
        double fee = 10;
        if (check < 20)
            fee += (.10 * check);
        else if (check >=20 && check <40)
            fee+= (.08 * check);
        else if (check >39 && check <60)
            fee += (.06 * check);
        else if(check >= 60)
            fee += (.04 * check);
        return fee;
    }
}