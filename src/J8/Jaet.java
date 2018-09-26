package J8;

import java.time.LocalDate;

public class Jaet {
    public static void main(String[] args) {
        LocalDate id=LocalDate.now();
        LocalDate yd=id.minusDays(1);
        LocalDate tm=id.plusDays(1);

        System.out.println(id);
        System.out.println(yd);
        System.out.println(tm);
    }
}
