package day15_methodCreation;

public class C07_MethodCreation {
    public static void main(String[] args) {

        String str="Ali";

        stringYazdir(str);

        // hosgeldiniz diyen bir metod olusturun

        hosgeldinYazdir();

        // kapanma mesaji yazan bir method olusturun

        kapanmaMethodu();
    }

    private static void kapanmaMethodu() {
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");
    }

    private static void hosgeldinYazdir() {
        System.out.println("Hosgeldin");
    }

    private static void stringYazdir(String str) {
        System.out.println(str);
    }
}
