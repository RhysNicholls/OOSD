package lectures.Semester1.week7;

import java.util.Scanner;

/**
 * @author JuliaD *
 *
 *
 */
public class ReadEnoughCharacters1 {

  public static void main(String[] args) {

    // Exploring continue and break
    // Read words from a file until a minimum total number of characters is reached
    int numChars = 40, total = 0;
    String token;

    Scanner sc = new Scanner(ReadEnoughCharacters1.class.getResourceAsStream("trombones.txt"));

    while (sc.hasNext()) {
      token = sc.next();
      total += token.length();
      System.out.print(token);

      if (total >= numChars) {
        break;
      }
    } // while (sc.hasNext()) {
    
    System.out.println("");
  } //main

} //class
