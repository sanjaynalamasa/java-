public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch ='a'; ch <='z'; ch++) {
            sb.append(ch);
            //Time Complecity 0(26) this one
            //for using String =  26 times loop repeat, + coping and adding n^2
        }
        System.out.println(sb.length());
    }
    
}
