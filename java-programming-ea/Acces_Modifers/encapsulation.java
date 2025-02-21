class Employee{
    private String name = "sanjay";

    //getter
    public String getName() {
        return name;
    }

    //Setter
    public void setName(String newName) {
        name =  newName;
    }
}

public class encapsulation {
    public static void main(String [] args) {
        Employee e = new Employee();
        e.getName();
        e.setName("sanjaynalamasa");
        System.out.println(e.getName());

    }
    
}
