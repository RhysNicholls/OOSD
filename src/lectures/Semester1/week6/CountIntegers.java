package lectures.Semester1.week6;

import java.util.Scanner;

/**
 * @author JuliaD
 */
public class CountIntegers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(
        CountIntegers.class.getResourceAsStream("trombones.txt"));
    int total = 0;

    while (sc.hasNext()) {
      if (sc.hasNextInt()) {
        total += sc.nextInt();
      } else {
        sc.next();
      }
    }

    System.out.println("The total = " + total);

  } //main

} //class
