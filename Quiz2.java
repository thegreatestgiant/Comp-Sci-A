package PACKAGE_NAME;
class Quiz2{
  public static void main(String[] args){
    System.out.println(distance(5,6));
    Employee emp1,emp2,emp3;
    emp1 = new Employee("Susan Meyers", 47899,"Accounting","Vice President");
    emp2 = new Employee("Mark Jones",29119,"IT","Programmer");
    emp3 = new Employee("Joy Rogers",81774,"Manufacturing","Engineer");
    System.out.println(emp1.getAllButId()+"\n"+emp1.getIdNumber());
    System.out.println(emp2.getAllButId()+"\n"+emp2.getIdNumber());
    System.out.println(emp3.getAllButId()+"\n"+emp3.getIdNumber());
    String sent = "The cow jumped over the moon";
    System.out.println(sentance(sent));
  }
   public static double distance(double speed, double time){
      return speed * time;
        
    }
  public static String sentance(String sent){
    String first = sent.substring(0,sent.indexOf(" "));
    String wofirst = sent.replaceFirst(first,"");
    int len = (wofirst.length()/2);
    String last = wofirst.substring(0,(wofirst.lastIndexOf(" ",len)+1));
    String mix = wofirst.replaceFirst(last,"");
    String done = mix + last + first;
    return done;
  }
}
