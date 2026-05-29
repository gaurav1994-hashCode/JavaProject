import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateClass {

    public static void main(String[] args)  {

        /*Date d = new Date();
        System.out.println(d);
//conver date to String
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("dd/mm/yyyy");
         java.lang.String formatted = simpleDateFormat.format(d);
        System.out.println(formatted);

        SimpleDateFormat s= new SimpleDateFormat("mm/dd/yyyy");
        java.lang.String s1 =s.format(d);
        System.out.println(s1);

        //convert String to Date
        SimpleDateFormat simpleDateFormat1= new SimpleDateFormat("dd/mm/yyyy");
        java.util.Date date =simpleDateFormat1.parse("22/01/1999");
        System.out.println(date);
*/


       /*java.time.LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        localDate=localDate.plusDays(3);
        System.out.println(localDate);
      localDate=  localDate.plusMonths(3);
       localDate= localDate.plusWeeks(4);
       localDate= localDate.plusYears(2);
        System.out.println(localDate);*/
/*
        boolean leapYear = LocalDate.parse("2020-02-20").isLeapYear();  //date formate imp
        System.out.println(leapYear);
        Period between = Period.between(LocalDate.parse("2020-01-22"), LocalDate.now());
        System.out.println(between);
     java.time.format.DateTimeFormatter dateTimeFormatter123 =  DateTimeFormatter.ofPattern("HH:MM");


        Duration between1 = Duration.between(LocalDate.parse("01:00"), dateTimeFormatter123);
        System.out.println(between1);*/
    }

}
