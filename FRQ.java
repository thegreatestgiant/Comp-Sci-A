package PACKAGE_NAME;

public class FRQ {
    public static void main(String[] args){
        String str = "CCAAAAATTT!";
        longestStreak1(str);
        longestStreak2(str);
    }

    public static void longestStreak1(String str){
        String currentChar = "";
        String maxChar = "";
        int maxLen = 0;
        char pc = ' ';

        for (int i = 0;i < str.length(); i ++){
            if(str.charAt(i) !=pc){
                currentChar = "";
            }
            currentChar += str.charAt(i);
            if(currentChar.length() > maxChar.length()){
                maxChar = currentChar;
            }
            pc = str.charAt(i);
        }
        System.out.println(maxChar.charAt(0) + " " + maxChar.length());
    }

    public static void longestStreak2(String str){
        String maxChar = "", currentChar = "";
        int maxLen = 0;
        int cur = 0;
        for (int i = 0;i < str.length(); i ++){
            currentChar += str.substring(i,i+1);
            cur = i+1;
            while(cur < str.length() && str.substring(cur,cur+1).equals(currentChar)){
                cur++;
            }
            if (cur > maxLen){
                maxLen = cur;
                maxChar = currentChar;
            }
        }
        System.out.println(maxChar.charAt(0) + " " + maxChar.length());
    }
}
