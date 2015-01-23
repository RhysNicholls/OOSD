package lectures.week5liveb.week4b;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Output the time and date
 * See http://www.mkyong.com/java/java-how-to-get-current-date-time-date-and-calender/
 * @author JuliaD
 */

public class ShowDate {

  public static void main(String[] args) {

    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();

    System.out.println("Today is: " + date); // Unformatted
    System.out.println(dateFormat.format(date)); //Formatted

  } //main

} //class
