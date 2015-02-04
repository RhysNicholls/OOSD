package lectures.Semester1.week9;

import java.util.Random;

/**
 *
 * @author Julia
 */
public class CharTime {

  public static void main(String[] args) {
    char c1 = 'b', c2 = 'g';
    for (int i = 0; i < 17; i++) {
      System.out.println(randomChar(c1, c2));
    }

  } // main

  private static char randomChar(char c1, char c2) {

    Random gen = new Random();
    return (char) (gen.nextInt(c2 - c1 + 1) + c1);

  }
} // CharTime
