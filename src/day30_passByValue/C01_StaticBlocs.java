package day30_passByValue;

public class C01_StaticBlocs {

    static {
        System.out.println("static bloc1 calisti");

    }
    static {
         /*
        static block class ilk calismaya basladiginda devreye girer
        ve class'in calismasi icin gerekli on hazirliklar icin kullanilir
        yazildigi satirin hic bir onemi yoktur, class icerisinde istenen yerde yazilabilir
        static block birden fazla olursa, bloklar yukaridan asagi dogru sirayla calisir
         */
        System.out.println("static bloc2 calisti");
    }


    C01_StaticBlocs(){
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method baslangici");
        C01_StaticBlocs obj1;
        new C01_StaticBlocs();
        System.out.println("main method sonu");
    }
}
