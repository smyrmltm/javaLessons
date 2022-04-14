package day14_stringManipulation;

public class C04_isimGizleme {
    public static void main(String[] args) {

       // Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //isim-soyisim : M***** B*******
        //kart no : **** **** **** 1234

        String isim="Oguzhan";
        String soyisim="BALKAYA";
        String kkNo="1234567890124356";

        String yeniIsim= isim.substring(0,1).toUpperCase() +
                        isim.substring(1).replaceAll("\\S","*");


        String yeniSoyisim= soyisim.substring(0,1).toUpperCase()+
                            soyisim.substring(1).replaceAll("\\S","*");

        String yeniKKNo="**** **** ****" + kkNo.substring(12);

        System.out.println("isim-soyisim : " +yeniIsim+ " " +yeniSoyisim+
                "\nkart no : " + yeniKKNo);



    }
}
