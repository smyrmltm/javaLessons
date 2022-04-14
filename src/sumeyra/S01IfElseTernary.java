package sumeyra;

import java.util.Scanner;

public class S01IfElseTernary {
    /*
    Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
     */

    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz: ");
        int sayi1 =scan.nextInt();
        int sayi2 =scan.nextInt();

        /*

        if (sayi1>sayi2) {
            System.out.println("Buyuk olmayan sayi: " + sayi2);
        }else if (sayi2>sayi1){
            System.out.println("Buyuk olmayan sayi: " + sayi1);

        }else {
            System.out.println("Sayilar birbirine esittir");
        }
        */
        if (sayi1!=sayi2){
            String sonuc = (sayi1>sayi2) ? "Buyuk olmayan sayi: " + sayi2 : "Buyuk olmayan sayi: " + sayi1;
            System.out.println(sonuc);
        }
       else System.out.println("Sayilar esittir");


        }


}

