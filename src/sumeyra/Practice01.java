package sumeyra;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("toplama icin 1\n cıkarma icin 2\n bolme icin 3\n carpma icin 4");

        System.out.println("lutfen iki tam sayi giriniz : ");

        int islem=scan.nextInt();

        double num1= scan.nextDouble();
        double num2= scan.nextDouble();

        if( islem==1){

            System.out.println("toplama işleminin sonucu :"+num1+" + "+num2+" = "+(num1+num2) );
        }else if ( islem==1) {

            System.out.println("cıkarma işleminin sonucu :" + num1 + " - " + num2 + " = " + (num1 - num2));

        }else if (islem==3) {
            System.out.println("bolme işleminin sonucu :" + num1 + " / " + num2 + " = " + (num1 / num2));
        }else if (islem==4) {
            System.out.println("carpma işleminin sonucu :" + num1 + " * " + num2 + " = " + (num1 * num2));
        }else System.out.println("hatalı secim yaptınız tekrar deneyiniz");
    }
}
