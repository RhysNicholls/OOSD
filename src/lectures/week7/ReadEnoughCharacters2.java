package lectures.week7;

import java.util.Scanner;

/**
 * @author JuliaD *
 *
 *
 */
public class ReadEnoughCharacters2 {

  public static void main(String[] args) {

    // Exploring continue and break
    // Read words from a file until a minimum total number of characters is reached
    // Same as previous version but ignore any words which contain an "e" 
    int numChars = 30, total = 0;
    String token;

    Scanner sc = new Scanner(ReadEnoughCharacters2.class.getResourceAsStream("trombones.txt"));

    while (sc.hasNext()) {
      token = sc.next();

      if (token.contains("e")) {
        // if (token.matches("^[tl].*")) { // ignore words beginning with t or l
        continue;
      }

      total += token.length();
      System.out.print(token);

      if (total >= numChars) {
        break;
      }
    } // while (sc.hasNext()) {

    System.out.println("");
  } //main

} //class
