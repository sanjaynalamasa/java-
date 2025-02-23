public class constructor {
    public static void main(String[] args) {
        Student stu = new Student("sanjaySahu", 20, 52); 
        System.out.println(stu.name+ " "+stu.age+stu.marks);

        Student s2 = new Student(stu);
        s2.password = "abc";
        
    }
}

class Student{
    String name;
    int age;
    String password;
    int marks[];

    //copy constructor
    Student(Student stu) {
        marks = new int[3];
        this.name = stu.name;
        this.age = stu.age;
        this.marks = stu.marks;

    }

    //constructor here
    Student(String nm, int a, int mks) {
        this.name = nm;
        this.age = a;
        marks = new int[3];
        System.out.println("when object is called this it will print");
    }

    void Display() {
        System.out.println();
        System.out.println();
    }


}
