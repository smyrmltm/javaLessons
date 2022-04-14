package day19_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        int input=5;

        int sayi=1;

        while (sayi<5){
            System.out.println(sayi);

            sayi++;

        }
       do {
           System.out.println(sayi);
           sayi++;

       }while (sayi<input);
    }
}
