package sumeyra;

import java.util.Scanner;

public class S06_forLoop {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int sayi= scan.nextInt();

        int toplam= 0;

        for (int i = 1; i <=sayi ; i++) {
            toplam+=i;
        }

        System.out.println(toplam);
    }
}
