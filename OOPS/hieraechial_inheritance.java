public class hieraechial_inheritance {
    public static void main(String[] args) {
        Child1 ch = new Child1();
        ch.cAge = 20;
        ch.cName = "sanjaynalamasa";
        ch.house = "HNk";
        ch.money = 66556565;
        ch.lands = 54;
        System.out.println(ch.cAge+" "+ ch.cName+" "+ch.house+" "+ch.lands+" "+ch.money);
        ch.jeans();
        ch.Software();


        Child2 ch1 = new Child2();
        ch1.cName = "thanushnalamasa";
        ch1.cAge = 15;
        ch1.house = "HNK";
        ch1.money = 3465565;
        ch1.lands = 65;
        System.out.println(ch1.cAge+" "+ ch1.cName+" "+ch1.house+" "+ch1.lands+" "+ch1.money);
        ch1.jeans();
        ch1.dataScientist();
    }
    
}
class Parents{
    int lands;
    int money;
    String house;
    void jeans() {
        System.out.println("From Parents Jeans inherit to children");
    }
}

class Child1 extends Parents{
    String cName;
    int cAge;
    void Software() {
        System.out.println("Works as a SoftWare Engineer");
    }
}

class Child2 extends Parents{
    String cName;
    int cAge;
    void dataScientist() {
        System.out.println("Works as a DataScientist");
    }
}
