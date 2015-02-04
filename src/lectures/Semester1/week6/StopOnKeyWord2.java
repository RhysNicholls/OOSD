package lectures.Semester1.week6;

import java.util.Scanner;

/**
 * @author JuliaD This program reads words from a file until it reaches a LINE
 * which contains a keyword
 */
public class StopOnKeyWord2 {

  public static void main(String[] args) {
    String keyWord = "morning", word;
    boolean found = false;

    Scanner scan = new Scanner(
        StopOnKeyWord.class.getResourceAsStream("trombones.txt"));

    while (scan.hasNextLine() && !found) {
      word = scan.nextLine();
//      if (word.contains(keyWord)) { //also see String matches (below)
      if (word.matches("^.*spring.*$")) { //using regex
        found = true;
      }
      System.out.println(word);
    }
    System.out.println("");

  } //main

} //class
