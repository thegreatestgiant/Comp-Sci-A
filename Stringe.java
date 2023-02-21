package PACKAGE_NAME;
class Stringe{
    public static void main(String[] args) {
    String words = "Torah is the Best";
    // int len = words.length();
    // System.out.println("Hello world! has " + len + " letters");

    // String subs = words.substring(0, 5);
    // System.out.println(subs);

    // subs = words.substring(6);
    // System.out.println(subs);

    int indx = words.indexOf(" ");
    System.out.println(indx);
    String firstWord = words.substring(words.indexOf("i"), words.indexOf("t"));
    System.out.println(firstWord);
    
  }
  
}
