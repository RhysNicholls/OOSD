package lectures.Semester1.week9;

import java.util.Calendar;

/**
 * @author JuliaD 
 * Making a method know something that the main method doesn't.
 * Is a birthday before or after current date
 */
public class CheckBirthday {

  public static void main(String[] args) {
    Calendar now = Calendar.getInstance();

    System.out.println("You have " + (beforeBirthday(now) ? "not " : "") + "had your birthday");
  } //main

  private static boolean beforeBirthday(Calendar now) {
    Calendar birthday = Calendar.getInstance();
    // We could read this data from an input file!
    // (year, month, date) Jan = 0
    birthday.set(2014, 10, 7);

    return birthday.after(now);
  }

} //class
