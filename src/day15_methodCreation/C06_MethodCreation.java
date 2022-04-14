package day15_methodCreation;

public class C06_MethodCreation {
    public static void main(String[] args) {

        int a=10;
        int b=20;


        ikiSayiTopla(a,b);
    }

    private static void ikiSayiTopla(int a, int b) {
        System.out.println("verilen iki sayinin toplami :" + (a+b));
    }
}
