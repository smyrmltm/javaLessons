package day18_nestedForLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {
        int sayiadedi = 5;
        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;

        for (int i = 1; i <= sayiadedi; i++) {
            System.out.println("lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            toplam += sayi;

        }
        System.out.println("girilen" + sayiadedi + "sayinin toplami :" + toplam);


        sayi = 0;
        toplam = 0;
        int sayac = 1;

        while (sayac <= sayiadedi) {
            System.out.println("lutfen bir sayi giriniz");
        }
    }
}
