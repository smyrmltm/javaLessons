package day10_switch_StringManipulation;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {
        //

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen kacinci ay oldugunu giriniz");
        int ayNo=scan.nextInt();

        switch (ayNo){

            case 1:
                System.out.println("Ocak");
            case 2:
                System.out.println("Subat");
            case 3:
                System.out.println("Mart");
            case 4:
                System.out.println("Nisan");

            case 5:
                System.out.println("Mayıs");
            case 6:
                System.out.println("Haziran");
            case 7:
                System.out.println("Temmuz");
            case 8:
                System.out.println("Agustos");



        }
    }
}
