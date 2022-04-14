package sumeyra;

import java.util.Scanner;

public class Practice02 {

    public static void main(String[] args) {
        /* TASK :
 *  Kullanicinin boyunu  cm  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

   INFO :
BMI = kilo(kg) /(boy*boy)(cm)
BMI <=20 oldukca zayifsiniz
20<BMI<=25 Normal sinirlardasiniz
25<BMI<=30 Sisman kategorisindesiniz
30<BMI ==> Obez grubundasiniz.

 */
        Scanner scan=new Scanner(System.in);
        System.out.println("boyunuzu cm giriniz : ");
        double boy=scan.nextDouble();

        System.out.println("kilonuzu kg giriniz : ");
        double kilo=scan.nextDouble();

        double bmi= kilo/((boy/100)*(boy/100));
        if (bmi<=20){
            System.out.println("oldukca zayıfsınız");
        }else if (20>bmi & bmi<=25){
            System.out.println("normal sınırlardasınız");
        }else if (bmi>25 & bmi>=30){
            System.out.println("sisman grubundasınız");
        }else if (bmi>30){
            System.out.println("obez grubundasınız");
        }
    }
}
