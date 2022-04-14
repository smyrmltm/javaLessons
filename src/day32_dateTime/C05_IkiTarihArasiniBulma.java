package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_IkiTarihArasiniBulma {
    public static void main(String[] args) {

        LocalDate bugun= LocalDate.now();
        LocalDate dogumgumu= LocalDate.of(1972,01,18);

        System.out.println(Period.between(dogumgumu,bugun));

        System.out.println(Period.between(dogumgumu,bugun).getYears());
    }
}
