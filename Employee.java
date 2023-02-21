class Employee{
    private String name,department,position;
    private int idNumber;

    public Employee(String n,int id,String dep, String pos){
        name = n;
        idNumber = id;
        department = dep;
        position = pos;
    }

    public Employee(String n,int id){
        name = n;
        idNumber = id;
        department = "";
        position = "";
    }

    public Employee(){
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }

    public  String getName(){
        return "Name is "+name;
    }

    public int getIdNumber(){
        return idNumber;
    }

    public String getDepartment(){
        return "Department is "+department;
    }

    public  String getPosition(){
        return "Position is"+position;
    }

    public String getAllButId(){
        return "Name is "+name+"\nPosition is"+position+"\nDepartment is"+department;
    }
}