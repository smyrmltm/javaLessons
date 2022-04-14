package sumeyra;

import java.util.Scanner;

public class S02Ternary {
    public static void main(String[] args) {

    /*
    Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin, negatifse
sayinin karesini yazdirin
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi != 0) {
            String sonuc = (sayi > 0) ? "sayi pozitif" : "sayi negatif " + (sayi * sayi);
            System.out.println(sonuc);

        } else System.out.println("sayı sıfıra esittir");

    }

}

