package day08_ifElseIfStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_Emeklilik {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen cisiyetinizi yaziniz" + "\nKadin icin K \nErkek icin E harfini giriniz");

        char cinsiyet=scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasınızı giriniz");
        double yas= scan.nextDouble();

        if(cinsiyet=='K'){

            if (yas<0 || yas>120){

                System.out.println("Lutfen girdiginiz yas degerini kontrol edin");
            } else if (yas<60){
                System.out.println("emekli olamazsın \nDaha" +(65-yas) + "yıl calisman gerekir");
            } else{
                System.out.println("emekli olabilirsin");
            }




        } else{

            System.out.println("Lutfen Cinsiyet icin gecerli bir harf giriniz");
        }
    }
}
