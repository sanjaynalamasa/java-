public class while_loop {
    public static void main(String[] args) {
        int counter = 0;
        while(counter <= 100) {
            System.out.println("hello world : "+counter);
            counter++;
        }
        System.out.println("its prints 100 times hello world with including 0");//this prints after the while condition false only
    }
}