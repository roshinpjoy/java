package Datee;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Datex {


    public static void main(String[] args) {

        Date d=new Date();
      SimpleDateFormat d1=new SimpleDateFormat("dd/MM/YY");
     //   System.out.println(d);
        System.out.println(d1.format(d));

        LocalDate date=LocalDate.now();
        System.out.println(date);


    }
}
