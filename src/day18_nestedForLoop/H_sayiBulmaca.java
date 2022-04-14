package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class H_sayiBulmaca {
    public static void main(String[] args) {

        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Random rnd=new Random();
        int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir tahminde bulunun");
        int tahmin= scan.nextInt();
        int sayac=1;

        while (tahmin!=sayi){
            String yol=(sayi<tahmin) ? "Sayiyi küçültünüz" : "Sayiyi büyültünüz";
            System.out.println(yol);
            tahmin= scan.nextInt();
            sayac++;
        }
        System.out.println("Tebrikler " + sayac + " denemede buldunuz." );

    }
}
