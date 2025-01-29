public class character_pattern {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        for(int line=1; line<=n; line++) {
            for(int character=1; character<=line; character++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}
