package geeks;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ExtractYear {

    public static void getYearCheck(String date){

        LocalDate currentdate= LocalDate.parse(date);
        int year =currentdate.getYear();
        System.out.println(year);
        System.out.println(currentdate.getDayOfMonth());
        System.out.println(currentdate.getChronology());
        System.out.println(currentdate.getMonthValue());
        System.out.println(currentdate.getMonth());
        System.out.println(LocalDate.now());
    }

    public static void main(String[] args) {
        getYearCheck("2021-07-25");

        //Method 2
       Calendar cr=  new GregorianCalendar(2021,07,27);
        System.out.println("***************************");
        System.out.println(cr.get(Calendar.YEAR));
        System.out.println(cr.getTime());
        System.out.println(cr.getCalendarType());
        System.out.println(cr.get(Calendar.DAY_OF_MONTH));
    }
}
