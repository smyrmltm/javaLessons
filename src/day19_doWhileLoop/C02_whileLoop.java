package day19_doWhileLoop;

public class C02_whileLoop {
    public static void main(String[] args) {

        int input=7629;
        int rakam=0;
        int rakamlarToplami=0;

        while (input>0){
            rakam=input%10;
            rakamlarToplami+=rakam;
            input/=10;
        }
        System.out.println(rakamlarToplami);
    }
}
