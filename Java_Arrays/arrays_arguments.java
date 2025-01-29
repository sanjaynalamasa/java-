public class arrays_arguments {
    public static void Update(int marks[], int unchangeable) {
         unchangeable = 10;
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }

    }
    public static void main(String[] args) {
        int marks[] = {99,98,97};
        int unchangeable = 5;
        Update(marks, unchangeable); //it cant change its prints only main function because of call by value in variables..
        System.out.println(unchangeable);
        //printing updated marks
        for(int i=0; i<marks.length; i++) {
            System.out.print(+marks[i]+" "); // it can change or updates with function because of in Arrays call by Reference is used.
        }
        System.out.println();
    }
    
}
