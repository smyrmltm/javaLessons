package sumeyra;

import java.util.Scanner;

public class S09_WhileLoop {
    public static void main(String[] args) {
        /*
        //While loop kullanarak 3 den 13 e kadar tum tek tamsayilari ekrana yazdiriniz.
        int sayi=3;
        while (sayi>=3 && sayi<=13){
            if (sayi%2==1) System.out.println(sayi);
            sayi++;
        }
         */


        /*
        //For loop ve while Loop kullanarak 3 basamakli sayilardan 15, 20 ve 90’na tam
        //bolunebilen sayilari yazdirin.

        int sayi=100;
        while (sayi>=100 && sayi<=999){
            if (sayi%15==0 && sayi%20==0 && sayi%90==0) System.out.println(sayi);
            sayi++;
        }
         */


        /*
        //Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve bitis degeri
        //dahil aradalarindaki tum cift tamsayilari while loop kullanarak ekrana yazdiriniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("iki sayi girin");
        int bas= scan.nextInt();
        int bit= scan.nextInt();


        int sayi=bas;
        while (sayi>=bas && sayi<=bit){
            if (sayi%2==0){
                System.out.println(sayi);
            }
            sayi++;
        }

         */


        /*
        //Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden baslayip bitis
        //harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin. Kullanicinin hata
        //yapmadigini farz edin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Iki harften birincisini giriniz:" );
        char basharf =scan.next().charAt(0);
        System.out.println("Ikinci harfi giriniz:" );
        char bitharf = scan.next().charAt(0);

        char harf =basharf;

        while (harf>=basharf && harf<=bitharf){
            String output = "" + harf;
            System.out.println(output.toUpperCase());
            harf++;
        }
         */

        //Kullanicidan pozitif bir tamsayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane
        //olduklarini ekranda yazdirin


     /* Scanner scan=new Scanner(System.in);
        System.out.println("Bir tamsayı giriniz");
        int deger=scan.nextInt();

        int sayac=0;
        int bolen=1;
        while (bolen<=deger){
            if (deger%bolen==0){
                System.out.println(deger+  "sayisi "+bolen + " sayisina tam bölünür");
                sayac++;
            }
            bolen++;
        }
        System.out.println("toplam bolen sayisi: " +sayac );

      */

       /* int sayi=9;

        do {
            if (sayi%7==0){
                System.out.println("7'ye bolunen sayilar: "+sayi);
            }
            sayi++;

        }
        while (sayi>=9 && sayi<=190);

        */



    }
}
