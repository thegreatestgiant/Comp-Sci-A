class Unit3{
    public static void main(String[] args){
          int score = 95;
          if (score >= 90)
              System.out.println("A");
          else if (score >= 80)
              System.out.printf("B");
          else if (score >= 70)
              System.out.println("C");
          else if (score >= 65)
              System.out.println("D");
          else
              System.out.println("F");

//        int y = 5;
//        int x = 12;
//        if(x>y){
//            System.out.println("X is Greater Than Y");
//        }
//        if(x==y){
//            System.out.println("X is equal to Y");
//        }
//        if(x!=y){
//            System.out.println("X does not equal Y");
//            x=y;
//            System.out.println("But now it does");
//        }
//        if(isEven(4655475))
//            System.out.println("hi t");
//        else
//            System.out.println("hi f");
    }
    public static boolean isEven(int num){
        return num%2 == 0;
    }
}