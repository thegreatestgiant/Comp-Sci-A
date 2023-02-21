class Selection {
    public static void main(String[] args){
        int x = 0;
        int y= 10;
        if (x > y && y/x > 2)
            System.out.println("abab");
        else System.out.println("b");





        double salary = 60000;
        double yearsEmployed = 3;
        double yearsNeeded = 3;

        if(salary >=60000 && yearsEmployed >= yearsNeeded)
            System.out.println("You Qualify");
        else if (salary >=60000 && yearsEmployed < yearsNeeded)
            System.out.println("You need " + ((int) (yearsNeeded - yearsEmployed)) + " Year(s) of employment");
        else if (salary <60000 && yearsEmployed >= yearsNeeded)
            System.out.println("You have too low of a salary");
        else System.out.println("You need to increase salary and years of employment");
//        else System.out.println("You Don't Qualify");


//        if (salary >= 60000){
//            if (yearsEmployed >= yearsNeeded)
//                System.out.println("You qualify for the loan");
//            else
//                System.out.println("You need " + (yearsNeeded - yearsEmployed) + " more years");
//        }
    }
}
