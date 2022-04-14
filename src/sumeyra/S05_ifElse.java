package sumeyra;

import java.util.Scanner;

public class S05_ifElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("0'dan buyuk bir sayi yaziniz");
        int sayi = scan.nextInt();

        if (sayi % 2 == 1) {
            System.out.println("harun");

        } else if (sayi >= 2 && sayi <= 5) {
            System.out.println("sümeyra");

        } else if (sayi >= 6 && sayi <= 20) {
            ;
            System.out.println("meltem");

        } else {
            System.out.println("hatice");
        }

    }
}
