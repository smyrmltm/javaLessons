package day20_scope_Arrays;

public class C02_StatikVariables {


    static String okulIsmi="Yildiz Koleji";
    static int okulNo;
    static boolean okulAcikmi;

    public static void main(String[] args) {
        System.out.println(okulIsmi);
        System.out.println(okulNo);
        okulNo=102;
        System.out.println(okulNo);
        System.out.println(okulAcikmi);
        staticMethod();
        System.out.println(okulNo);


    }
    public static void staticMethod(){
        okulNo=200;
        System.out.println(okulNo);
    }

}
