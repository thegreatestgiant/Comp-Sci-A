package PACKAGE_NAME;

public class twod {
    public static void main(String[] args){
        int[] arr = {2,4,6,8,10,0,0};
        int num = 7;
        insert(arr, num);
        print(arr);
        remove(arr, num);
        print(arr);
    }

    public static void remove(int[] arr, int num){
        int index = 0;
        while(num != arr[index]){
            index++;
        }
        for (int i = index; i < arr.length - 1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = 0;
    }
    public static void print(int[] a){
//        for (int i=0;i<a.length;i++){
//            System.out.print(a[i] + " ");
//        }
        for (int i:a){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void insert(int[] arr, int num){
//        search for value
        int index = 0;
        while(num > arr[index]){
            index++;
        }
        for(int i=arr.length-1; i>index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = num;
    }

}
