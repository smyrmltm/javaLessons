package day17_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {

        // verilen iki harf ve arlarindaki harfleri yazdiran
        // bir kod yaziniz

        char ilkHarf='m';
        char sonHarf='t';

        for (char i = ilkHarf; i <=sonHarf ; i++) {

            System.out.println(i+ " ");

        }


        double baslangic=10;
        double bitis=20;
        double artis=0.2;

        for (double i = baslangic; i <=bitis ; i+= artis) {

        }
    }
}
