package day20_scope_Arrays;

public class C01_InstanceVariabels {

    int sayi;
    String bransIsMi="Java";
    boolean okuldaMi;

    public static void main(String[] args) {

        // sayi=10;  sayi variable'i static olmadigi icin main method'dan direk kullanilamaz
        // instance variable'lara static method'lardan ulasabilmek icin obje olusturmamiz gerekir


        C01_InstanceVariabels obj1= new C01_InstanceVariabels();
        System.out.println(obj1.sayi); // 0
        obj1.sayi=10;
        System.out.println(obj1.sayi); //10
        obj1.bransIsMi="SQL";
        System.out.println(obj1.okuldaMi);


        C01_InstanceVariabels obj2= new C01_InstanceVariabels();
        System.out.println(obj2.sayi);
        System.out.println(obj2.bransIsMi);

        obj1.okuldaMi=true;
        System.out.println(obj2.okuldaMi);


    }
}
