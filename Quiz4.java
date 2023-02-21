import java.util.*;
public class Quiz4 {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
//       #1
//        System.out.println("give me a positive non zero integer");
//        int num = key.nextInt();
        int ret=0;
//        for(int i=1;i<=num;i++){
//            ret+=i;
//        }
//        System.out.println(ret);

//        #2
        double pen=.01, total=0;
//        System.out.println("How many days have you worked? (don't input a number under 1");
//        int days = key.nextInt();
//        while(days < 1){
//            System.out.println("How many days have you worked? (don't input a number under 1)");
//            days = key.nextInt();
//        }
//        while (days >0){
//            days--;
//            total+=pen;
//            pen*=2;
//        }
//        System.out.println("You get $" + total);

//        #3
        String pal = "racecar";
//        System.out.println(isPalindrome(pal));

//        #4
        int m = 14;
        int n = 6, ren = 0;
        int save = n;
        int count = 1, rem = 0;
        while(n != m){
            n+=save;
            count ++;
            if(n>m){
                rem = (m + save) - n;
                n = m;
                count --;
            }
        }
//        System.out.println("The division is " + count);
//        System.out.println("The remainder is " + rem);


//        #5
        System.out.println("Give me a integer no greater than 15.");
        int ex = key.nextInt();
        for(int i=0;i<ex;i++){
            for(int j=0; j<ex;j++) {
                System.out.print("x");
            }
            System.out.print("\n");
        }


    }
    public static boolean isPalindrome(String word){
        String pal = "";
        for (int i=word.length()-1;i>=0;i--){
            pal += word.charAt(i);
        }
        if(pal.equals(word)) {
            return true;
        }
        else{
            return false;
        }
    }
}
