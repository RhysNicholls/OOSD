package lectures.Semester1.week5liveb;

import java.util.Scanner;

/**
 *
 * @author Julia
 */
public class NumbersInRange {

  public static void main(String[] args) {
    // Read numbers from an input file (resource/numbers.txt) and 
    // only print out those which are greater than 10 but less than 100
    // ???

    int n; // 

    Scanner sc = new Scanner(NumbersInRange.class.getResourceAsStream("numbers.txt"));

    while (sc.hasNextInt()) {

      n = sc.nextInt();
      if ((n > 10) && (n < 100)) {
        System.out.println("n is in range: " + n);
      }

    } // while

  } // main
} // NumbersInRange
