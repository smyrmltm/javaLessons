package day30_passByValue;

public class C02_StaticBlocs {

    {
        System.out.println("static olmayan bloc calisti");
    }
    static {
        System.out.println("static bloc calisti");

    }

    public static void main(String[] args) {
        System.out.println("main method basi");

        C02_StaticBlocs obj1=new C02_StaticBlocs();
        C02_StaticBlocs obj2=new C02_StaticBlocs();
    }


}
