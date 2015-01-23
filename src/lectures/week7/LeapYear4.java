package lectures.week7;

import java.util.Scanner; 
import javax.swing.JOptionPane;

public class LeapYear4 {
  public static void main(String args[]) {
//     A leap year is
//     divisible by 4 but not by 100
//     or
//     divisible by 100
//    
//     TRUE if year % 4 == 0 AND NOT divisible by 100 
//     TRU if year % 400 = 0
    
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year = input.nextInt();

    // Check if the year is a leap year 
    boolean isLeapYear = 
      (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    // Display the result in a message dialog box or console
    System.out.println(year + " is a leap year? " + isLeapYear);
    //JOptionPane.showMessageDialog(null, year + " is a leap year? " + isLeapYear);
    
    // Using the ternary operator
    System.out.println(year + " is " + (isLeapYear?"":"not ") + "a leap year");
  } 
}

