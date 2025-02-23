public class static_ {
    public static void main(String[] args) {
        Student s1 =  new Student();
        s1.SchoolName = "chaitanya";
        // System.out.println(s1.SchoolName);

        Student s2 = new Student();
        // s2.SchoolName = "Chaitanaya University";
        System.out.println(s2.SchoolName); //it will take directly the s1 and prints
    } 
}
class Student{
    String name;
    int roll;  

    static String SchoolName;

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;  
    }
}


