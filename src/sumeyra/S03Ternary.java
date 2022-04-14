package sumeyra;

import java.util.Scanner;

public class S03Ternary {
    public static void main(String[] args) {

        /*
         Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” , buyuk harfse
consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin
         */
        
        Scanner scan = new Scanner(System.in);
     /*
       System.out.println("bir harf girin");
       char harf = scan.next().charAt(0);
       int ASCIIharf = harf;

       String sonuc = (ASCIIharf>=65 & ASCIIharf<=90) ? "Buyuk Harf"
               : ((ASCIIharf>=97 & ASCIIharf<=122) ? "Kucuk Harf" : "girdiginiz karakter harf degil");
       System.out.println(sonuc);
    */

        //Kullanicidan bir tamsayi alin ve sayi 10’dan kucukse “Rakam” , 100’den kucukse “iki
        //basamakli sayi”degilse “uc basamakli veya daha buyuk sayi” yazdirin

       System.out.println("Sayi giriniz: ");
       int sayi= scan.nextInt();
       String sonuc= (sayi<10) ? "Rakam" :(sayi<100 ? "iki basamakli sayi" :"uc basamakli veya daha büyük sayi");
       System.out.println(sonuc);
    }

}
