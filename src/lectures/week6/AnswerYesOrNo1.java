package lectures.week6;

import java.util.Scanner;

/**
 *
 * @author Julia
 */
public class AnswerYesOrNo1 {

  public static void main(String[] args) {
    // Keeping asking user until they answer yes or no (version 1)
    Scanner scan = new Scanner(System.in);
    String s;
    System.out.print("Enter yes or no: ");
    s = scan.nextLine();

    while (!s.equalsIgnoreCase("yes") && !s.equalsIgnoreCase("no")) {
      System.out.print("Enter yes or no: ");
      s = scan.nextLine();
    }

    System.out.println("You entered: " + s);
  } // main

} // AnswerYesOrNo1
