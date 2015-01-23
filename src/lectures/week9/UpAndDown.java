package lectures.week9;

import java.util.Scanner;

/**
 * @author JuliaD
 */
public class UpAndDown {

  public static void main(String[] args) {
    int count=0;
    Scanner sc = new Scanner(UpAndDown.class.getResourceAsStream("numbersB.txt"));
    
    while(sc.hasNextInt()) {
      count += numberInRange(sc.nextInt(), 10, 30) ? 1 : 0;
    }
    
    System.out.printf("There are %d numbers in range\n", count);

  } //main

  private static boolean numberInRange(int num, int lower, int upper) {
    return (num < lower || num > upper) ? true : false;
  }

} //class
