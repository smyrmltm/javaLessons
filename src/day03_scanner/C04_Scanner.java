package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {
        // Scanner kullanmak için 3 adim takip ediyoruz
        // 1. adım kendimize bir scanner oluşturmak

        Scanner scan = new Scanner(System.in);  // esitligin sagında yeni bir scanner olusturulur
                                                // ve olusturulan bu scanner scan variable'na assign edilir

        System.out.print("Lutfen isminizi giriniz: ");

        String kullaniciIsmi=scan.next();

        System.out.println("Kullanicinin girdigi isim : " + kullaniciIsmi);

    }

}
