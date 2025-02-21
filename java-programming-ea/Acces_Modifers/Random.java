class ChaiShop {
    static int cnt = 0;
    int bnt = 0;

    //static method
    static void fun() {
        System.out.println(1);
    }
}


class Random {
    public static void main(String args[]) {
        ChaiShop a = new ChaiShop();
        ChaiShop b = new ChaiShop();
        ChaiShop.cnt++;   // it has write has  a.cnt++;
        ChaiShop.cnt++;                  //   a.bnt++;
        b.cnt++;
        b.bnt++;
        System.out.println(a.cnt +" "+a.bnt);
        System.out.println(b.cnt +" "+b.bnt);

          //calling ChaiShop
        ChaiShop.fun();
        



    }
}