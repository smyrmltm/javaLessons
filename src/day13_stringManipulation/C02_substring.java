package day13_stringManipulation;

public class C02_substring {
    public static void main(String[] args) {

        String str="1-48 of 7000 results for \"nutella\"";


        int ilkSpace= str.indexOf(" ");
        int ikinciSpace= str.indexOf(" ",ilkSpace+1);
        int ucuncuSpace= str.indexOf(" ", ikinciSpace+1);

        String aramaSonucSayisiStr = str.substring(ikinciSpace+1,ucuncuSpace);

        int aramaSonucsayisiInt=Integer.valueOf(aramaSonucSayisiStr);

        if (aramaSonucsayisiInt>100){
            System.out.println("Super");
        }else{
            System.out.println("az sonuc bulundu");
        }
    }
}
