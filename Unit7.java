package PACKAGE_NAME;
import java.util.*;

public class Unit7 {
    public static void main(String[] args){
        ArrayList<Integer> alist = new ArrayList<>();

        alist.add(5);
        alist.add(7);
        alist.add(3);
        alist.add(3);
        alist.add(9);
        alist.add(7);
        alist.add(2);

        printArr(alist);

        for(int i=0;i<alist.size();i++){
            if(alist.get(i) == 3){
                alist.remove(i);
                i--;
            }
        }

        printArr(alist);

    }

    public static void printArr(ArrayList<Integer> alist){
        for(int i=0;i<alist.size();i++){
            System.out.print(alist.get(i));
        }
        System.out.println();
    }

}
