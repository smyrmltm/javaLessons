package day15_methodCreation;

public class C08_MethodCreation {
    public static void main(String[] args) {

        String isim="Oguzhan";
        String soyisim="BALKAYA";
        String kkNo="1234567890124356";

        isimSoyisimGizle(isim,soyisim);
        krediKartiGizle(kkNo);

        String yeniIsim= isim.substring(0,1).toUpperCase() +
                isim.substring(1).replaceAll("\\S","*");


        String yeniSoyisim= soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S","*");

        String yeniKKNo="**** **** ****" + kkNo.substring(12);

        System.out.println("isim-soyisim : " +yeniIsim+ " " +yeniSoyisim+
                "\nkart no : " + yeniKKNo);


    }

    private static void krediKartiGizle(String kkNo) {
        String yeniKKNo="**** **** ****" + kkNo.substring(12);
    }

    public static String isimSoyisimGizle(String isim, String soyisim) {

        String yeniIsim= isim.substring(0,1).toUpperCase() +
                isim.substring(1).replaceAll("\\S","*");


        String yeniSoyisim= soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S","*");

        return yeniIsim+" "+yeniSoyisim;

    }
}
