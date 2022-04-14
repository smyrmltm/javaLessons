package sumeyra;

import java.util.Scanner;

public class S07_palindrom {
    public static void main(String[] args) {
        // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden

        Scanner scan= new Scanner(System.in);
        System.out.println("bir kelime giriniz :");
        String girilenKelime= scan.next();

        //System.out.println(polindromMethod(girilenKelime));
        String cevap = polindromMethod(girilenKelime);
        System.out.println(cevap);


    }

    private static String polindromMethod(String girilenKelime) {
        String tersKelime="";

        for (int i = girilenKelime.length()-1; i >=0 ; i--) {
            tersKelime+=girilenKelime.substring(i,i+1);

        }
        System.out.println(tersKelime);
        String sonuc= (girilenKelime.equals(tersKelime)) ? "polindrom" : "polindrom degil";
        return sonuc;

    }
}
